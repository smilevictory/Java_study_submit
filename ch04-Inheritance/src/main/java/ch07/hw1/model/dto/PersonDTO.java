package ch07.hw1.model.dto;

public class PersonDTO{
    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    // 기본 생성자
    public PersonDTO(){

    }

    // 매개변수 생성자
    public  PersonDTO(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }
    public String information (){
        return "이름: " + name + ", 나이: " + age + ", 키 : "+height+", 몸무게: "+weight;
    }
}