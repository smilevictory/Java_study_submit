package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");   // 생성자 통해 model 초기화
        myCar.setSpeed(127);            // speed 설정

        myCar.run();                   // 출력 확인
    }
}
