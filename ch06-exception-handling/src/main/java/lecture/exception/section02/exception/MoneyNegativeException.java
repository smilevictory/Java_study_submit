package lecture.exception.section02.exception;

public class MoneyNegativeException extends Exception{
    // 기본 생성자
    public MoneyNegativeException(){

    }

    public MoneyNegativeException(String message){
        super(message);
    }
}
