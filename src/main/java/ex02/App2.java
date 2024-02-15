package ex02;

public class App2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData2 dbData1 = new DBData2(1, "제목1", "내용1", 1, "댓글1");
        DBData2 dbData2 = new DBData2(1, "제목1", "내용1", 2, "댓글2");
        DBData2 dbData4 = new DBData2(2, "제목2", "내용2", 3, "댓글3");

        // 2. dbData를 ViewData에 옮기시오 - ORM
        
    }
}
