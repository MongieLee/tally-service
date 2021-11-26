package cn.mgl.tally.controller;

import cn.mgl.tally.converter.c2s.UserInfoC2SConverter;
import cn.mgl.tally.exception.InvalidParameterException;
import cn.mgl.tally.model.service.UserInfo;
import cn.mgl.tally.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<UserInfo> getUserInfoById(@PathVariable("id") Long id) {
        val userInfo = userInfoService.getUserInfoById(id);
        if (id == null || id < 0L) {
            throw new InvalidParameterException(String.format("The user id : %s is invalid", id));
        }
        return ResponseEntity.ok(userInfoC2SConverter.convert(userInfo));
    }
}
