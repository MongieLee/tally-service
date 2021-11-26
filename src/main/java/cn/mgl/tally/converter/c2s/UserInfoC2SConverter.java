package cn.mgl.tally.converter.c2s;

import cn.mgl.tally.model.common.UserInfo;
import com.google.common.base.Converter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoC2SConverter extends Converter<UserInfo, cn.mgl.tally.model.service.UserInfo> {
    @Override
    protected cn.mgl.tally.model.service.UserInfo doForward(UserInfo userInfo) {
        return cn.mgl.tally.model.service.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getUsername())
                .build();
    }

    @Override
    protected UserInfo doBackward(cn.mgl.tally.model.service.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }
}
