package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        String[] array = {"100", "1oo"};
        for(int i=0; i<=array.length; i++) {
        try{
            int value = Integer.parseInt(array[i]);
            System.out.println("array[" + i + "]: " + value);

        }catch (NumberFormatException e){
            System.out.println("숫자 형식 예외 발생: " + e.getMessage());
            e.printStackTrace();
        }  catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("배열 인덱스 초과 예외 발생: " + e.getMessage());
        e.printStackTrace();
    }

        }
    }
}
