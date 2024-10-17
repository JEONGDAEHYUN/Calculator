package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 구구단수 값
                                    // sc.nextInt() 는 사용자 지정값을 나타냅니다.

        // 조건문과 반복문을 이해하기에 구구단 만한것이 없다!
        for (int i=2; i<=9; i++) { // 구구단의 첫 번째 수
            if (i == passNum) {
                continue; // 만약 i값과 passNum값이 같다면 넘기고 지속한다.
            }
            for (int j=2; j<=9; j++) { // 구구단의 두 번째 수 (초기값, 조건문, 증가연산)
                System.out.println(i + "곱하기" + j + "는" + (i*j) + "입니다.");
            }
        }
    }
}
