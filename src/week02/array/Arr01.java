package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray = new int[3]; // {0, 0, 0}
        boolean[] boolArray = new boolean[3]; // {false, false, false}
        String[] stringArray = new String[3]; // {"", "", ""}  ""= nul(없다)

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArray2; // 생성된 int형 배열을 intArray2로 선언
        intArray2 = new int[3]; // {0, 0, 0} 배열 생성 위에서 끌어다옴(참조)

        // 생성한 배열을 순회 -> 배열의 값을 하나씩 뽑아서 조회한다.
        // (1) 단건조회
        System.out.println(intArray[1]);  // 2번째 값을 출력
        System.out.println("---------");  // 구분 절

        // (2) 다건 조회(important!)
        // elngth : 길이를 구하는 메서드
        for (int i=0; i<intArray2.length; i++) { // for문 (초기값; 조건문; 증가연산;)
            System.out.println(intArray[i]); // 조건에 따라 증가하는 index값
        }
    }
}
