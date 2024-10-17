package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기, 최소값 구하기
        int[] arr = {3, 2, 0, 5, 1}; // arr 단건조회, {}중괄호로 초기화

        // 최대값 초기화 세팅
//      int max = arr[0]; // 최대값의 변수 max 선언, arr 의 0번째 3, (arr 은 단건조회), 이것을 하는 이유를 생각해 보니 배열의 맨 첫번째 에서 연산을 하기 위해 최대값을 3으로 바꾼것 같다.

        // 최소값  초기화 세팅
        int min = arr[0];

        // 최대값 구하기 로직
//        for (int num: arr) { // 향상된 for 문, num 값은 arr 값인 {3, 2, 1, 5, 1}이다. (num 은 number 의 약자이다.)
//            if (num > max) { // if문(조건문)  num 은 max 값보다 크다.(앞서 max 값은 3으로 초기화 세팅 하였다.)
//                max = num; // num 값이 max 값보다 크면 max 를 num 으로 바꾼다.
//            }
//        }
//        System.out.println("최대값은 => " + max);

        // 최소값 구하기 로직
        for (int num: arr) { // 향상된 for 문, num 값은 arr 값인 {3, 2, 1, 5, 1}이다. (num 은 number 의 약자이다.)
            if (num < min) { // if문(조건문)  num 은 min 보다 작다. (앞서 min 값은 3으로 초기화 세팅 하였다.)
                min = num; // num 값이 min 값보다 작으면 min 를 num 으로 바꾼다.
            }
        }
        System.out.println("최소값은 => " + min);
    }
}
