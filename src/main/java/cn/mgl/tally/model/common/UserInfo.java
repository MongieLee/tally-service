package cn.mgl.tally.model.common;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserInfo {
    private long id;
    private String username;
    private String password;
}
