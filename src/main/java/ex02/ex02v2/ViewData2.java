package ex02.ex02v2;

import ex02.ex02v1.Reply;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ViewData2 {
    private int boardId;
    private String title;
    private String content;

    // Board 데이터만 넣는 생성자
    public ViewData2(List<DBData2> dbList) {
        if (dbList.size() > 0) {
            this.boardId = dbList.get(0).getBoardId();
            this.title = dbList.get(0).getTitle();
            this.content = dbList.get(0).getTitle();
        }


//        // 방법1 -> 한번에 해결
//        dbList.stream().forEach(data ->{
//            addReply(new Reply(data.getReplyId(), data.getComment()));
//        });

        // 방법2
        for (ex02.ex02v2.DBData2 data : dbList) {
            Reply r = new Reply(data.getReplyId(), data.getComment());
            addReply(r);
        }


    }


    // 댓글들은 addReply로 추가하기
    private List<Reply> replies = new ArrayList<>();
    // 컬렉션 Reply 만들어 준이유 setter호 해결이 안됨

    public void addReply(Reply reply){
        replies.add(reply);
    }

}