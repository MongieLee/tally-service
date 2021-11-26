package cn.mgl.tally.model.persistence;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {
    private long id;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
}
