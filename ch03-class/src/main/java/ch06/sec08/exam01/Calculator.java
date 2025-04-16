package ch06.sec08.exam01;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 덧셈 메서드
    int plus(int x, int y) {
        return x + y;
    }

    // 나눗셈 메서드 (double 반환)
    double divide(int x, int y) {
        return (double) x / y;
    }

    // 전원을 끄는 메서드
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
