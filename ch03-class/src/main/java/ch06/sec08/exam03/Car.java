package ch06.sec08.exam03;

public class Car {
    int gas;

    // gas 값을 변경하는 메서드
    void setGas(int gas) {
        this.gas = gas;
    }

    // gas가 남아 있는지 확인하는 메서드
    boolean isLeftGas() {
        if (this.gas == 0) {
            System.out.println("gas가 없습니다");
            return false;
        } else {
            System.out.println("gas가 있습니다");
            return true;
        }
    }

    // gas가 있을 때 주행 가능한 run 메서드
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                gas--;
            } else {
                System.out.println("멈춥니다. (gas잔량: " + gas + ")");
                return;
            }
        }
    }
}
