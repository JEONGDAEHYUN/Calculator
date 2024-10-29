package Calulator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1. 첫번째 숫자를 입력받는다.
        // Scanner, int
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력받는다.: ");
        int firstNumber = sc.nextInt();
        // 2. 두번째 숫자를 입력받는다.
        System.out.println("두 번째 숫자를 입력받는다.: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        // int
        // 3. 연산자를 입력받는다.
        System.out.println("연산자를 입력받는다.: ");
        String input = sc.nextLine();
        // +, -, *, /, string
        // 4. 입력받은 값을 출력한다.
        // sout
        System.out.println("첫번째 숫자: " + firstNumber + " 두번째 숫자: " + secondNumber + " 연산자: " + input);

        int print = 0;
        // firstNumber, secondNumber, input
        if(input.equals("+")) {
            print = firstNumber + secondNumber;
        } else if(input.equals("-")) {
            print = firstNumber - secondNumber;
        } else if(input.equals("*")) {
            print = firstNumber * secondNumber;
        } else if(input.equals("/")) {
            if(secondNumber == 0) {
                System.out.println("secondNumber는 0이 될수 없습니다.");
                return;
            }
            print = firstNumber / secondNumber;
        } else{
            System.out.println("연산자가 아닙니다.");
            return;
        }
        System.out.println(print);
    }
}
