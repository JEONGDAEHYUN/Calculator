package week02.array;
import java.util.Arrays;


public class Arr04 {
    public static void main(String[] args) {
        // 2. Arrays.copy0f() 메서드, 깊은복사 (clone이란 깊은 복사도 있으며 2차원 배열에선 얕은복사로 작동)
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.
                                              // a.length는 함수 값으로 a와는 전혀 다른 주소값이 부여된다.
                                              // 함수는 입력이 있으면 출력이 있다.
        a[3] = 0;
        System.out.println(a[3]); // a의 3번째 즉 4를 0으로 바꾼다.
        System.out.println(b[3]); // b는 a와 다른 주소값을 가짐으로 변수값에 영향 받지 않고 4가 출력된다.
    }
}
