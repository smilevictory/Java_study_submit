package ch12.sec08;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간 정보 얻기
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 0부터 시작
        int day = now.get(Calendar.DAY_OF_MONTH);

        // 요일 (1=일요일, ..., 7=토요일)
        int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
        String[] dayNames = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        // 오전/오후
        int amPm = now.get(Calendar.AM_PM);
        String amPmStr = (amPm == Calendar.AM) ? "오전" : "오후";

        // 시/분/초
        int hour = now.get(Calendar.HOUR); // 12시간제 (0~11)
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // 0시 표현 보정 (Calendar.HOUR은 12시를 0으로 표현)
        if (hour == 0) {
            hour = 12;
        }

        // 최종 출력
        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(dayNames[dayOfWeek] + " " + amPmStr);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }



}
