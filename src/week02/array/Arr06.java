package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        // 반복문을 통한 초기화
        int[][] array = new int[2][3]; // array라는 변수를 int 2차원 배열[][] 로 선언 = 변수를 2차원 배열 array로 선언(최초 선언)
                                       // new int 변수 2열 3줄 이라는 뜻, 0과 1로 배열된다.

        for (int i = 0; i < array.length; i++) { // for문 (초기값; 조건문; 증가연산), i가 array 길이보다 작다. array 최대 길이는 3 임으로 증가연산 하면 i 값으로 나올수 있는 수는 0, 1, 2 이다.
            for (int j = 0; j < array[i].length; j++) { //for문 (초기값; 조건문; 증가연산), j가 array[i] 길이 보다 작다. array[i] 의 값은 [0, 1, 2] 이고 최대 길이는 2 임으로 j 값으로 나올수 있는 수는 0, 1 이다.
                System.out.println("출력값 =>" + i + "," + j); // i = [0, 1, 2] j = [0, 1] 임으로 2차원 배열하면 출력값은 6 조합니 나옵니다.
                array[i][j] = 0; // i, j 는 위 new int[2][3] 숫자를 의미하며 인덱스 라고 부릅니다.
            }
        }
    }
}
