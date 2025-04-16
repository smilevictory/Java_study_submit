package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGas(5); // gas 주입

        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run(); // gas 0까지 달림
        }

        System.out.println("gas를 주입하세요.");

    }
}
