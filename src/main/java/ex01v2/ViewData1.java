package ex01v2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ViewData1 {
    private int boardId;
    private String title;
    private String content;

    private User user;

    // 직접 생성자 만든후
    // 파라미터에 통으로 받음
    public ViewData1(DBData1 dbData) {
        this.boardId = dbData.getBoardId();
        this.title = dbData.getTitle();
        this.content = dbData.getContent();
        this.user = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
    }

}
