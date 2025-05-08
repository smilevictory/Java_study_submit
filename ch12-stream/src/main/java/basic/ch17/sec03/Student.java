package basic.ch17.sec03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor

public class Student {
    private String name;
    private int score;
//    public Student (String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//    public String getName() { return name; }
//    public int getScore() { return score; }

}
