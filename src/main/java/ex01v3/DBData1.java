package ex01v3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DBData1 {
    private int boardId;
    private String title;
    private String content;
    private int userId;
    private String username;
    private String email;

    // 매개 변수 받을 필요가 없다.
    public ViewData1 toViewData(){
        return new ViewData1(
                boardId,
                title,
                content,
                new User(userId, username, email)
        );
    }
}
