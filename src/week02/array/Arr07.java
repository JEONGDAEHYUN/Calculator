package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        // 가변배열    [] 비어있는 배열 값을 각기 다른 크기로 지정할 수 있다.
        int[][] array = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2]; // array 0번 조건은 [2]이다.
        array[1] = new int[4]; // array 1번 조건은 [4]이다.
        array[2] = new int[1]; // array 2번 조건은 [1]이다.

        // 중괄호로 초기화를 해버릴 때도 가능함!!,  강의에서 초기화라는 표현을 썼는데 위에 먼저 선언된 array를 array2로 초기화 해서 선언한다는 내용 같다.
        int[][] array2 = { // 초기화라는 것이 []를 초기화 한다는것 인가??????????
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
    }
}
