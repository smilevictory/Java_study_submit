package lecture.book;

public class Application {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.author="양귀자";
        myBook.pageCount=320;
        myBook.title = "모순";
        myBook.coverType="하드커버";


        // 제목을 희망
        Book myBook2 = new Book();
        myBook2.author="양귀자";
        myBook2.pageCount=320;
        myBook2.title = "희망";
        myBook2.coverType="하드커버";

        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook2.toString());
        System.out.println(myBook.toString());

        Book myBook3 = new Book("bear","자바가 좋아요", "하드타입", 50);
        System.out.println(myBook3);

    }
}
