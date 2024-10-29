package Calulator;

import java.util.ArrayList;

public class MyCalculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성, 외부에서 직접 접근 불가하도록 private 설정
    ArrayList<Integer> results = new  ArrayList<Integer>();

    public int calculate(int firstNumber, int secondNumber, String input) {
        int result = 0;
        // result 값을 초기화 한다. nullPointException 방지
        switch(input) {
            case("+"):
                result = firstNumber + secondNumber;
                break;

            case("-"):
                result = firstNumber - secondNumber;
                break;

            case("/"):
                if(secondNumber == 0) {
                    System.out.println("연산자 기호는 0이 될수 없습니다.");
                    break;
                }
                result = firstNumber / secondNumber;
                break;

            case("*"):
                result = firstNumber * secondNumber;
                break;

            default:
                System.out.println("연산자 기호가 아닙니다.");
        }
        return result; // 계산 결과를 반환한다.
    }
    // Getter 메서드 , 연산결과 조회
    public ArrayList<Integer> getResults() {
        return results;
    }
    // Setter 메서드
    public void setResult(int result) {
        results.add(result);
    }
}
