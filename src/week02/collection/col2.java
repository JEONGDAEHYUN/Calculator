package week02.collection;

import java.util.LinkedList;

public class col2 {
    public static void main(String[] args) {
        // Linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아 놓는다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        //  기본적 기능은 -> ArrayList 와 동일!
        // LinkedList 는 값 -> 여기 저기 나누어서 : 조회하는 속도가 "느리다..."
        // 값을 추가하거나, 삭제할 때는 빠릅니다.

        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // LinkedList 선언 + new LinkedList 생성, 좌변에서 선언과 동시에 우변에서 new LinkedList
        // 라는 이름의 <Integer>() 비어있는 함수 를 만들어 주었다. 비어 있음으로 add(추가) 할 수 있다.
        linkedList.add(5); // 5를 add(추가) 한다.
        linkedList.add(10); // 10을 add(추가) 한다.
        linkedList.add(3); // 3을 add(추가) 한다.

        System.out.println(linkedList.get(0)); // 선언된 linkedList 의 0번째를 get 해준다. 5
        System.out.println(linkedList.get(1)); // 선언된 linkedList 의 1번째를 get 해준다. 10
        System.out.println(linkedList.get(2)); // 선언된 linkedList 의 2번째를 get 해준다. 3

        System.out.println(linkedList.toString()); // linkedList 를 []배열해 준다. [5, 10, 3] , 이렇듯 조회할 때는 arraylist보다 속도가 현저히 느리다.

        linkedList.add(200);
        System.out.println(linkedList.toString()); // toString() 함수를 사용하여 linkedList 에 200을 추가한다.

        linkedList.add(2,4); // index list상 위치값, list상 element 배열값
        System.out.println(linkedList.toString()); // linkedList 의 2번째 를 4로 추가한다(add).

        linkedList.set(1, 30); // linkedList 의 1번째를 30으로 바꾼다.(set)
        System.out.println(linkedList.toString()); // linkedList 의 1번째를 30으로 바꾼값으로 []배열 한다.

        linkedList.remove(1); // 1번째 값 삭제(remove)
        System.out.println(linkedList.toString()); // 삭제한 값을 []배열해준다.

        linkedList.clear(); // 전체 삭제(clear)
        System.out.println(linkedList.toString()); // 전체 삭제한 값을 []배열해준다.
    }
}
