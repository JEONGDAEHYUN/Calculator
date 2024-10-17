package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // [Set(집합) : 순서 없고, 중복 없음!!]
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set-> 그냥 쓸 수도 있음. 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음!!!!
        // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있다.

        Set<Integer> intSet = new HashSet<>();  // 선언 및 생성


        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet) { // 이렇게 들어간 value 하나하나에 intSet 에 들어간 모든 값들이 세팅이 되면서 for문이 돌아간다.
                                      // 위에 주석은 강의 설명 내용이다. value 는 값을 의미, 즉 위에 내용은 향상된 for문에 Integer 값(value)을 세팅하라는 말이다.
            System.out.println(value); // 값(value)을 출력,  1 5 9 12
        }

        // contains(포함하다)
        System.out.println(intSet.contains(2)); // intSet 은 2를 포함하고 있니? 출력 false
        System.out.println(intSet.contains(5)); // intset 은 5를 포함하고 있니? 출력 true
    }
}
