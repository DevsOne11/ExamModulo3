package domains.auth;


import domains.BaseEntity;
import enums.Language;
import enums.Role;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements BaseEntity{
    private String id;
    private String username;
    private Role role;
    private Language language;
}
