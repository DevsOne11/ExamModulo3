package domains.auth;

import lombok.*;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  14:43   20/06/22
 * @Project :  ExamModulo3
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Answer {
    private String id;
    private String questionId;
    private String answer;
    private Boolean isRight;
}
