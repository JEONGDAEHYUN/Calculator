import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
// 1
//        int a = 5;
//        int b = 3;
//        int sum = a + b;
// 2
//        int a = 10;
//        int b = 20;
//        int average = (a + b) / 2;
// 3
//        int a = 17;
//        int b = 5;
//        double answer = a / b;
//        double answer1 = a % b;
// 4
//        int a = 10;
//        int b = 10;
//        boolean answer = (a == b);
// 5
//        int a = 7;
//        int b = 12;
//        if (a > b) {
//            System.out.println(a);
//        }
//        else {
//            System.out.println(b);
//        }
// 6
//        int a = 5;
//        int b = 8;
//        int c = 100;
//        int max = a;
//        if (max < b) {
//            max = b;
//        }
//        if (max < c) {
//            max = c;
//        }
//        System.out.println(max);

        // 7
//        boolean a = true;
//        boolean b = false;
//        boolean answer = a && b;

        // 8
//        boolean a = true;
//        boolean b = false;
//        boolean answer = a || b;

        // 9
//        boolean a = false;
//        boolean b = false;
//        boolean c = false;
//        boolean answer = !(a || b || c);

        // 10
//        int a = 10;
//        a = a + 5;
//        a = a * 2;
//        a = a - 10;

        // 11 두 변수의 값 바꾸기
        // a는 b이다 로 a를 b 값으로 바꾼다.
        // b는 a이다 로 b를 a 값으로 바꾼다.
        // 두 변수의 값이 서로 바뀌었다.

        // 14 두 수의 대소 관계 비교, 세번째 수 포함시켜서
        // if 문을 활용하여 a가 더 큰지 b가 더 큰지 의 결과를 출력
        // if 문을 활용하여 a가 더 큰지 c가 더 큰지 의 결과를 출력

        // 조건문
        // 1 양수 또는 음수 판별, 사용자로부터 정수를 입력받아 양수인지 음수인지 또는 0인지
        // 사용자로 부터 정수를 입력 받는다. Scanner 타입의 변수 선언
        // 입력 받은 값이 0보다 크다    if문 활용
        // 입력 받은 값이 0보다 작다
        // 입력 받은 값이 0이다.

        // 2
        // 시험 점수를 입력 받는다.
        // 60점 이상이면 합격
        // 60점 미만이면 불합격
        Scanner scanner = new Scanner(System.in);
        System.out.println("시험 점수: "); // 사용자에게 알린다.
        int score = scanner.nextInt(); // 입력받은 점수를 int 타입으로 변수 선언

        if (60 <= score) { // 60보다 크거나 같다
            System.out.println("합격"); // true 면 합격
        } else {
            System.out.println("불합격"); // false 면 불합격
        }
    }
}
