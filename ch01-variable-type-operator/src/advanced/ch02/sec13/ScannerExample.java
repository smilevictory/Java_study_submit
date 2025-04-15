package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("x 값 입력 : ");

            int str = sc.nextInt();
            if (str==56) {
                break;
            }
            System.out.println("입력값 = " + str);
        }

        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }
}
