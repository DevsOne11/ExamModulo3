package vo.auth;


import domains.auth.User;
import lombok.*;
import vo.GenericVO;

import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserVO extends GenericVO {
    private String userName;
    private String password;
    private LocalDateTime createdAt;

    public UserVO(User user) {
        super(user.getId());
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.createdAt = user.getCreatedAt();
    }

    @Builder(builderMethodName = "childBuilder")
    public UserVO(Long id, String userName, String password, LocalDateTime createdAt) {
        super(id);
        this.userName = userName;
        this.password = password;
        this.createdAt = createdAt;
    }
}
