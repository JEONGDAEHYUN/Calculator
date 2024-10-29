package Lotto;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random(); // random 선언
//        random.nextInt(45); // 정수 난수 생성, Random 클래스에서 bound 로 수의 범위 제한
//        int a = random.nextInt(45);
//        int b = random.nextInt(45);
//        int c = random.nextInt(45);
//        int d = random.nextInt(45);
//        int e = random.nextInt(45);
//        int f = random.nextInt(45);
        HashSet<Object> lottoNumber = new HashSet<>(); // HashSet 클래스는 중복을 허용하지 않는다., <Object> 모든유형의 객체 저장(제내릭 타입 매개변수), 즉 중복되지 않는 수를 저장할 공간 lottoNumber 를 선언한다.
        while(lottoNumber.size() < 6) { // while 문(반복문) 조건이 true 이면 중괄호 안의 값을 실행하고 false 면 종료, 로또넘버 사이즈가 6보다 작을때, 즉 0~5번쨰 까지의 수 6개
            lottoNumber.add(random.nextInt(45) + 1); // random 수가 add 된다. bound 는 난수의 범위를 지정해준다.
//            if((random.nextInt(45) == 0) { // 0~45 번쨰 숫자 ? 0 어떻게 안나오게 하지?
//                0 < 45
//            }
        }
        System.out.println("Lotto 번호: " + lottoNumber); // 값 출력
    }
}
