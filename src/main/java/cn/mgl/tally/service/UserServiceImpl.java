package cn.mgl.tally.service;

import cn.mgl.tally.converter.p2c.UserInfoP2CConverter;
import cn.mgl.tally.dao.UserInfoDao;
import cn.mgl.tally.model.common.UserInfo;
import lombok.val;
import org.springframework.stereotype.Service;

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
        val userInfo = userInfoDao.getUserInfoById(userId);
        return userInfoP2CConverter.convert(userInfo);
    }
}
