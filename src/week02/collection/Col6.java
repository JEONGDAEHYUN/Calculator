package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map :key - value pair -> 중요 !!!
        // key라는 값으로 unique하게 보장이 돼야 함!!
        // Map -> HashMap, TreeMap으로 응용!

        Map<String, Integer> intMap = new HashMap<>(); //  new HashMap 생성 및 intMap 선언

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);// 중복 key
        intMap.put("삼", 15); // 중복 key

//        // key 값 전체 출력(향상된 for문)
//        for (String key: intMap.keySet()) { // keySet: key 만 빼서 배열로 만드는 것, 문자 배열 임으로 string 을 쓴다
//            System.out.println(key); // 이 일 삼 출력됨 "삼" 중복된 key는 생략

        // value 값 전체 출력(향상된 for문)
        for (Integer value: intMap.values()) { // values: 값 전체 조회, 수 배열 임으로 Integer 타입을 쓴다.
            System.out.println(value); // 12 11 15 출력됨 13 14는 조회 됬었다가 마지막 15가 덮어쓰기됨(key 값 같아서), 덮어쓰기한다(업퍼쳐진다.)
        }

        // key 를 가지고 value를 찾아오는 법
        System.out.println(intMap.get("삼")); // "삼" 이라는 key를 가지고 있는 value(값) 를 가지고 오게 된다. 업퍼쳐져서 15값 출력
    }
}
