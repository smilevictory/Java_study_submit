package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자: model 필드 초기화
    public Car(String model) {
        this.model = model;
    }

    // speed getter
    public int getSpeed() {
        return speed;
    }

    // speed setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // run 메서드
    public void run() {
        System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
    }
}
