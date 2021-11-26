package cn.mgl.tally.converter.p2c;

import cn.mgl.tally.model.persistence.UserInfo;
import com.google.common.base.Converter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoP2CConverter extends Converter<UserInfo, cn.mgl.tally.model.common.UserInfo> {
    @Override
    protected cn.mgl.tally.model.common.UserInfo doForward(UserInfo userInfo) {
        return cn.mgl.tally.model.common.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getUsername())
                .build();
    }

    @Override
    protected UserInfo doBackward(cn.mgl.tally.model.common.UserInfo userInfo) {
        return UserInfo.builder()
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }
}
