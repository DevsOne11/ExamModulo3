package domains.auth;

import domains.BaseEntity;
import enums.Language;
import enums.Level;
import lombok.*;

import java.time.LocalDateTime;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  14:33   20/06/22
 * @Project :  ExamModulo3
 */



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quiz implements BaseEntity {
    private String id;
    private String userId;
    private String subjectId;
    private Level level;
    private Language language;
    private LocalDateTime complatedAt;
}
