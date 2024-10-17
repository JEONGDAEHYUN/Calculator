package week02.collection;

import java.util.ArrayList;

public class col1 {
    public static void main(String[] args) {
        // list
        // 순서가 있는 데이터의 집합 => Array(최초의 길이를 알아야 함)
        // 처음에 길이를 몰라도 만들 수 있음!
        // Array -> 정적배열
        // List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        //  - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        //  - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니까 상관없다!!!

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성, 좌변에서 선언과 동시에 우변에서 new ArrayList 라는 이름의
                                                               // <Integer>() 비어있는 함수 를 만들어 주었다. 비어 있음으로 add(추가) 할 수 있다.
        intList.add(99); // Integer에 수를 add(추가) 할수 있다.
        intList.add(15);
        intList.add(3);

//        System.out.println(intList.get(1)); // intList 에 get 이라는 메서드를 제공 x번째 임 으로 y의 값이 출력된다.

        // 2번째 있는 값(15)을 바꿔보자.(set)
//        intList.set(1, 10);
//        System.out.println(intList.get(1));


        System.out.println(intList.get(0)); // 0번째 index 는 99
        // 삭제 (remove)
        intList.remove(0); // index 란 List 의 시작점 부터 얼마나 떨어져 있는지를 나타내는 값이다.(논리적 위치를 의미한다.)// 위치값을 주고 remove(삭제) 한다.
        System.out.println(intList.get(0)); // 0번째 index 가 15로 바뀌었다.

        // 전체값 삭제 (crear)
        System.out.println("클리어 전");
        System.out.println(intList.toString()); // tostring() 은 intList 값을 []배열 형태로 보여주는 함수이다.
        intList.clear(); // intList 값을 clear() 함수로 삭제한다.
        System.out.println("클리어 후");
        System.out.println(intList.toString()); // tostring 은 intList 값을 []배열 형태로 보여주는 함수이다.
    }
}
