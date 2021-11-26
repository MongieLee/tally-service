package cn.mgl.tally.controller;

import cn.mgl.tally.converter.c2s.UserInfoC2SConverter;
import cn.mgl.tally.model.service.UserInfo;
import cn.mgl.tally.service.UserInfoService;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/user")
public class UserInfoController {
    private final UserInfoService userInfoService;
    private final UserInfoC2SConverter userInfoC2SConverter;

    public UserInfoController(UserInfoService userInfoService, UserInfoC2SConverter userInfoC2SConverter) {
        this.userInfoService = userInfoService;
        this.userInfoC2SConverter = userInfoC2SConverter;
    }

    @GetMapping("{id}")
    public UserInfo getUserInfoById(@PathVariable("id") long id) {
        val userInfo = userInfoService.getUserInfoById(id);
        return userInfoC2SConverter.convert(userInfo);
    }
}
