package cn.mgl.tally.model.service;


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
