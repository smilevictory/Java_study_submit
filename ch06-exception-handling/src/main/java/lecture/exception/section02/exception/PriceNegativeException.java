package lecture.exception.section02.exception;

public class PriceNegativeException extends Exception{

    // 기본 생성자
    public PriceNegativeException(){

    }

    public PriceNegativeException(String message){
        super(message);
    }
}
