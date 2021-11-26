package cn.mgl.tally.service;

import cn.mgl.tally.converter.p2c.UserInfoP2CConverter;
import cn.mgl.tally.dao.UserInfoDao;
import cn.mgl.tally.exception.ResourceNotFoundException;
import cn.mgl.tally.model.common.UserInfo;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserInfoService {
    private final UserInfoP2CConverter userInfoP2CConverter;
    private final UserInfoDao userInfoDao;

    public UserServiceImpl(UserInfoP2CConverter userInfoP2CConverter, UserInfoDao userInfoDao) {
        this.userInfoP2CConverter = userInfoP2CConverter;
        this.userInfoDao = userInfoDao;
    }

    @Override
    public UserInfo getUserInfoById(long userId) {
        val userInfo = Optional
                .ofNullable(userInfoDao.getUserInfoById(userId))
                .orElseThrow(() -> new ResourceNotFoundException(String.format("user id %s was not found", userId)));
        return userInfoP2CConverter.convert(userInfo);
    }
}
