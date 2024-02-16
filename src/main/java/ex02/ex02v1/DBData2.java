package ex02.ex02v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DBData2 {
    private int boardId;
    private String title;
    private String content;
    private int replyId;
    private String comment;
}
