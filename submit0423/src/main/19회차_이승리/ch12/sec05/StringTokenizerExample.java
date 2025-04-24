package ch12.sec05;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String data2 = "홍길동/이수홍/박연수";

        // 1. split 메서드를 이용한 분리
        System.out.println("== split 결과 ==");
        // 분리 기준 : & ,
        String[] names1 = data1.split("&|,");
        for (String name : names1) {
            System.out.println(name);
        }

        // 2. StringTokenizer를 이용한 분리
        System.out.println("\n== StringTokenizer 결과 ==");
        // 분리 기준 : /
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
