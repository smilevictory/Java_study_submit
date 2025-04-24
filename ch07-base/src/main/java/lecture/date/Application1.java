package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        // Date 연도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제출력: " +legacyDate); //2025 + 1900 -> 오류 발생

        // Calendar 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println("Calender.set(2025,3,23 -> 실제 월 : " + cal.getTime());
    }
}
