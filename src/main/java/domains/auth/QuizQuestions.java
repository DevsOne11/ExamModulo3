package domains.auth;

import domains.BaseEntity;
import lombok.*;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  14:40   20/06/22
 * @Project :  ExamModulo3
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizQuestions implements BaseEntity {
    private String id;
    private String quizId;
    private String questionId;
    private Boolean isRight;
}
