package ch07.hard.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet()); // 로그인 합니다.
        method(new FileDownloadServlet()); // 파일 다운로드합니다.
    }
    // 메서드 선언
    public static void method(HttpServlet servlet ) {
        servlet.service();

    }

}
