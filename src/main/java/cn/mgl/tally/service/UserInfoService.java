package cn.mgl.tally.service;

import cn.mgl.tally.model.common.UserInfo;

public interface UserInfoService {
    /**
     * get user information by user's id
     *
     * @param userId the specific user id
     * @return model's common UserInfo Object
     */
    UserInfo getUserInfoById(long userId);
}
