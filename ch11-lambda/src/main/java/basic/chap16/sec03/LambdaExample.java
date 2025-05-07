package basic.chap16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //매개변수가 두 개일 경우
        person.action1((x,y)->{
            System.out.print(x + "이 ");
            System.out.println( y+"를 합니다");
        });
        person.action1((x,y)->
            System.out.println(x + "이 "+ y+"를 하지않습니다")
        );
        //매개변수가 한 개일 경우
        person.action2((z)->{
            System.out.print("\""+ z +"\"");
            System.out.println("라고 말합니다");
        });

        person.action2((w)->
            System.out.println("\""+w+"\"" + "라고 외칩니다")

        );
    }
}
