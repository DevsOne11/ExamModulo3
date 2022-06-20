package vo.auth;


import lombok.*;
import vo.BaseVO;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
public class UserCreateVO implements BaseVO {
    private String userName;
    private String password;
}
