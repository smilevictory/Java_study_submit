package ch07.hw1.run;

import ch07.hw1.model.dto.EmployeeDTO;
import ch07.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 1번 : 학생 정보를 모두 출력하세요
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서

        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1,"시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2,"경영과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4,"정보통신공학과");

        System.out.println("학생 정보 출력");
        for (StudentDTO student : students) {
            System.out.println(student.information());
        }



        // 2번 : 사원정보를 입력받고 기록 할 수 있게 하세요
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        EmployeeDTO[] employees = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // 사용자 입력창
        while(true){
            System.out.println("\n====== 사원 정보 입력 ======");
            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.println("나이: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("신장: ");
            double height = Double.parseDouble(sc.nextLine());

            System.out.println("몸무게: ");
            double weight = Double.parseDouble((sc.nextLine()));

            System.out.println("급여: ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.println("부서: ");
            String dept = sc.nextLine();


            // 입력된 정보로 사원 배열 생성
            employees[count++] = new EmployeeDTO(name, age, height, weight, salary, dept);


            // 추가 입력 여부
            System.out.print("계속 입력하시겠습니까? (y/n): ");
            String choice = sc.nextLine();
            if (!(choice.equals("y") || choice.equals("Y"))) {
                break;
            }

            // 배열 크기 초과시 입력 불가

            if (count >= employees.length) {
                System.out.println("더 이상 저장할 수 없습니다.");
                break;
            }
        }

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
        System.out.println("사원 정보 출력");
        for (int i = 0; i < count; i++) {
        System.out.println(employees[i].information());
    }

        sc.close();


    }
}
