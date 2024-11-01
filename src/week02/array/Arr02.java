package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        // 1. 배열에 특정값 대입해서 선언
//        int[] intArr = {10, 20, 30, 40, 50};
//        String[] stringArray = {"a", "b", "c", "d"};

//        // 2. for문을 통해서 대입
//        for(int i=0; i<intArr.length; i++) {
//            intArr[i] = i;
//        }

//        System.out.println("----");
        // 다건출력
//        for(int i=0; i<intArr.length; i++) { // 이럴경우 01234로 출력되고 5 안나옴
//            System.out.println(intArr[i]);
//        }
        int[] intArr = {10, 20, 30, 40, 50};

//        for (int item: intArr) { // 향상된 for문으로 변수값이 그대로 출력
//            System.out.println(item);
//        }

        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1); // intArr값을(배열의 주소) 1로 초기화(.fill)

        for (int item: intArr) {
            System.out.println(item);
        }
    }
}
