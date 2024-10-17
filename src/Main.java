public class Main {

    public static void main(String[] args) {
        // 작은 크기의 타입이 큰 크기의 타입과 '계산' 될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 됩니다.
        int intNumber = 10; // intNumber 선언
        double doubleNumber = 5.5; // doubleNumber 선언
        double result = intNumber + doubleNumber; // double result 선언, intNumber + doubleNumber 할당

        System.out.println("Plus => " + result); // "Plus => " + result 참조 및 출력

        // 1) 정수로 나누기, intNumber(할당)을 4로 나눈다. 나눈 값은 iResult(선언) 이다.
        int iResult = intNumber / 4;
        // 2) 실수로 나누기
        double dResult = intNumber / 4.0;
        // iResult(참조), "/"(쌍따옴표 사이 문자로 표시), dResult(참조)
        System.out.println(iResult + " / " + dResult);
    }
}