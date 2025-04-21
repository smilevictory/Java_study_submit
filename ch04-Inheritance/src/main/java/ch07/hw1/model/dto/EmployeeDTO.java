package ch07.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    // 기본 생성자
    public EmployeeDTO(){

    }

    // 매개변수 생성자
    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept){
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;

    }
    @Override
    public String information() {
        return super.information() + ", 급여: " + salary + ", 부서: " + dept;
    }
}
