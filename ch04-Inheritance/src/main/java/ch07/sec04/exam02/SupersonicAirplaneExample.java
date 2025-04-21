package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        /*
        * public void fly() {
        * System.out.println("일반 비행합니다.");
        * */
        sa.flyMode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();

        /*
        * @Override
        * public void fly() {
        *         if(flyMode == SUPERSONIC) {
        *             System.out.println("초음속 비행합니다.");
        *         } else {
        *             super.fly();
        * }
        * */
        sa.flyMode = SuperSonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
