package basic.ch17.sec10;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int [] multiplesOf2 = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();

        //2의 배수 카운팅
        long count = multiplesOf2.length;

        // 2의 배수 총합
        int sum = Arrays.stream(multiplesOf2).sum();
        // 2의 배수 평균
        OptionalDouble avg = Arrays.stream(multiplesOf2).average();

        // 2의 배수 중 최대값
        OptionalInt max = Arrays.stream(multiplesOf2).max();

        // 2의 배수 중 최소값
        OptionalInt min = Arrays.stream(multiplesOf2).min();

        // 첫 번째 3의 배수
        OptionalInt multipleof3 = Arrays.stream(arr)
                .filter(n -> (n%3 == 0))
                .findFirst();

        System.out.println("2의 배수 개수: " + count);
        System.out.println("2의 배수의 합: " + sum);
        System.out.println("2의 배수의 평균: " + (avg.isPresent() ? avg.getAsDouble() : "N/A"));
        System.out.println("최대값: " + (max.isPresent() ? max.getAsInt() : "N/A"));
        System.out.println("최소값: " + (min.isPresent() ? min.getAsInt() : "N/A"));
        System.out.println("첫 번째 3의 배수: " + (multipleof3.isPresent() ? multipleof3.getAsInt() : "N/A"));

    }
}
