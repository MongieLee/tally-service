package cn.mgl.tally.dao;

import cn.mgl.tally.model.persistence.UserInfo;

public interface UserInfoDao {
    UserInfo getUserInfoById(long id);

    void createNewUser(String username, String password);
}
