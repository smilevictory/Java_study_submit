package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    // 멤버 필드 초기화 생성자
    public Student(String name, int no){
        this.name=name;
        this.no = no;
    }
    // Getter/ Setter 메소드
    public String getName(){
        return name;
    }
    public int getNo(){
        return no;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setNo(int no){
        this.no = no;
    }
}
