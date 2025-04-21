package ch07.hw1.model.dto;

public class StudentDTO extends PersonDTO{
        private int grade;
        private String major;

        // 기본 생성자
        public StudentDTO(){

        }

        // 매개변수 생성자
    public  StudentDTO(String name, int age, double height, double weight, int grade, String major){
            super(name, age, height, weight);
            this.major = major;
            this.grade = grade;
    }
    @Override
    public String information() {
        return super.information() + ", 학년: " + grade + ", 전공: " + major;
    }

    }

