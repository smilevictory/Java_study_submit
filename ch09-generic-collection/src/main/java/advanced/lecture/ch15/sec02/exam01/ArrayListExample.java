package advanced.lecture.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Board 클래스를 저장하기 위한 ArrayList 인스턴스 생성
        List<Board> list = new ArrayList<>();

        // 2. Board 클래스의 인스턴스 5개 생성후 추가
        list.add(new Board("주제1", "내용1", "작성자1"));
        list.add(new Board("주제2", "내용2", "작성자2"));
        list.add(new Board("주제3", "내용3", "작성자3"));
        list.add(new Board("주제4", "내용4", "작성자4"));
        list.add(new Board("주제5", "내용5", "작성자5"));

        // 3. 저장된 요소 개수 출력
        System.out.println("" + list.size());

        // 4. 3번째 데이터를 추출하여 출력
        System.out.println("3번째 데이터 : " + list.get(2));

        // 5. for문 이용해서 리스트 각 요소 출력
        System.out.println("-----일반 for문 순회-----");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // 6. 인덱스 2 요소 제거
        list.remove(2);

        // 7. 인덱스 2 요소 제거
        list.remove(2);


        // 8. for문 이용해서 리스트 각 요소 출력
        System.out.println("-----향상된 for문 순회-----");
        for(Board board : list){
            System.out.println(board);
        }



    }
}
