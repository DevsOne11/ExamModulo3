package domains.auth;

import domains.BaseEntity;
import lombok.*;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  14:37   20/06/22
 * @Project :  ExamModulo3
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject  implements BaseEntity {
    private String id;
    private String name;
    private String description;
}
