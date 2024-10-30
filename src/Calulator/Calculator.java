package Calulator;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성, 외부에서 직접 접근 불가하도록 private 설정
//    ArrayList<Integer> results = 0; ??? 선언과 동시에 초기화해서? 질문해보자!!
    private ArrayList<Integer> results = new  ArrayList<Integer>();

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
        results.add(result);
        return result; // 계산 결과를 반환한다.
    }
    // Getter 메서드
    public ArrayList<Integer> getResults() { // 전체 연산 결과 겟한다. 가져온다.
        return results; // 반환
    }
    // Setter 메서드
    public void setResults(ArrayList<Integer> results) { // 연산 결과 수정
        this.results = results;
    }
    public void removeResult() {
        /* 구현 */
        // 1. 0번쨰 부터 삭제(호출 될때마다 삭제)
        results.remove(0);
    }
}
