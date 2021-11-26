package cn.mgl.tally.dao.mapper;

import cn.mgl.tally.dao.UserInfoDao;
import cn.mgl.tally.model.persistence.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserInfoDao {
    private final UserInfoMapper userInfoMapper;

    public UserDaoImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return userInfoMapper.getUserInfoById(id);
    }

    @Override
    public void createNewUser(String username, String password) {
        System.out.println("创建了用户" + username + password);
    }
}
