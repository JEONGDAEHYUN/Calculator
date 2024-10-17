package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO 원통 모양, 선입선출
        // 메서드 종류 : add, peek, poll 더하고 조회하고 뽑는거
        // Queue : 생성자가 없는 인터페이스 <-

        Queue<Integer> intQueue = new LinkedList<>(); // Queue 는 생성자가 없기 때문에 new 키워드로 생성할 수 없다., intQueue 선언 및 생성(new LinkedList 빌려서 생성)

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()) { // isEmpty() 값이 있음으로 false 를 retun 하나 !부정으로 true 가 된다.
            System.out.println(intQueue.poll()); // intQueue 를 poll 해준다.(빼준다.), poll 없으면 1 5 9 값이 무한으로 출력된다.
        }

        // 추가(위에서 pol 했으니까 다시 add한다.)
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        // peek
        System.out.println(intQueue.peek()); // ()안에 0번째 1번째 등등을 넣어 봤는데 안된다. 이유는 선입선출로 peek 할 수 있기때문이다.
        System.out.println(intQueue.size()); // intQueue 의 size 를 묻는것으로 출력은 4이다.
    }
}
