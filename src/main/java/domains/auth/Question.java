package domains.auth;

import domains.BaseEntity;
import enums.Language;
import enums.Level;
import lombok.*;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  14:38   20/06/22
 * @Project :  ExamModulo3
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question implements BaseEntity {
    private String id;
    private String subjectId;
    private String question;
    private String answer;
    private Level level;
    private Language language;
}
