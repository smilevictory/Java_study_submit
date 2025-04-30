package ch15.sec03.exam03;
import java.util.*;


public class HashSetExample {
    public static void main(String[] args) {
//HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();
//객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");
// Iterator 패턴으로 순회하며 각 요소를 출력하세요.
        System.out.println("=====Iterator 사용=====");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

// 향상된 for 문으로 순회하며 각 요소를 출력하세요.
        System.out.println("===== 향상된 for문 사용 =====");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
