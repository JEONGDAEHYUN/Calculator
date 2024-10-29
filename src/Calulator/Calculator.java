package Calulator;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성 및 선언
        MyCalculator myCal = new MyCalculator(); // MyCalculator 객체 생성 및 선언
        // 계산한 값 저장하기 위해 result(변수) 선언 및 초기화
        int result = 0; // 원시 타입(원시 타입 > 정수형)

        while (true) {
            System.out.println("계속하려면 아무 키나 입력해 주시고 종료하려면 exit 를 입력해주세요");
            String exit = sc.nextLine(); // nextLine() 메서드에서 사용자의 입력값을 받고 String 타입의 exit 을 선언
            if ("exit".equals(exit)) { // if (exit.equals("exit")) 와 같다. nullPointException 방지 위해 선언된 exit 를
                break; // if 문을 통해 조건을 넣어주고 조건이 true 일 경우 break 제어자로 while 문을 종료
            }
            System.out.println("첫 번째 숫자를 입력하세요: "); // 첫 번째 숫자를 입력하세요: 가 출력된다.
            int firstNumber = sc.nextInt(); // 7번째 줄에서 선언된 Scanner sc를 할당하여 nextInt로 입력값 있을시 입력값을 인식하게 한다.
//        System.out.println(firstNumber); // 9번째 줄 sc.nextInt()에서 인식한 입력값 firstNumber 를 출력해준다.

            System.out.println("두 번째 숫자를 입력하세요: "); // 두 번째 숫자를 입력하세요: 가 출력된다.
            int secondNumber = sc.nextInt(); // 7번째 줄에서 선언된 Scanner sc nextInt로 입력값 있을시 입력값을 인식하게 한다.
//        System.out.println(secondNumber); // 13번째 줄 sc.nextInt()에서 인식한 입력값 secondNumber 를 출력해준다.
            sc.nextLine(); // 입력버퍼 안에 있는 공백기호 삭제(버퍼 비우기)

            System.out.println("사칙연산 기호를 입력하세요: "); // 사칙연산 기호를 입력하세요: 가 출력된다.
            String input = sc.nextLine(); // 7번째 줄에서 선언된 Scanner sc를 할당하여 nextLine로 입력값이 있을시 입력값을 인식하게 한다.
            result = myCal.calculate(firstNumber, secondNumber, input); // calculate 메서드 호출, 호출 시에는 타입 x
            //
            System.out.println(result);

        }

        // switch 문 에서 계산된 result 값을 출력


    }
}

