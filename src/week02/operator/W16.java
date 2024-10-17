package week02.operator;

public class W16 {
    public static void main(String[] args) {

//        int number = 0;
//
//        // ~하는 동안
//        while (number < 3) { // number < 3 인 동안~~
//            number++; // ++없으면 0계속 출력되는 무한루프
//            System.out.println(number + "출력!");
//        }

        // do ~ while 작업 선행 후 조건이 온다. '선행' 수행 후 조건이 적용
//        int number = 4;
//        do {
//            // do 안에 있는 로직을 먼저 수행하겠다. 직관적
//            System.out.println(number + "출력!");
//        } while (number < 3); // 어떤 수를 넣어도 출력됨 이유는 do를 먼저 하기때문

        // break(깨부수다)
        // 가장 가까운 블록의 for문 또는 while(반복문) switch(조건문)문을 중단!
//        int number = 0;
//        while (number < 3) {
//            number++; // 1씩 더해진다.
//            if (number == 2); { // 2와 같아지면
//            break; // 조건값이 깨진다. {break;} 없어도 작동 된다
//            }
//            System.out.println(number + "출력!!");
//        }

//        for (int i=0; i<10; i++) {
//            System.out.println("i:" + i); // for문 (초기값; 조건문; 증가연산) "문자값으로 출력" + 변수값
//            if (i == 2) { // ex) 보통 index 약자로 i를 씀 두번째는 j
//                break; // i가 2일 때, 가장 바깥 반복문이 종료
//            }
//            for (int j=0; j<10; j++) {  // 중첩 for문 (초기값; 조건문; 증가연산)
//                System.out.println("j:" +j); // for문 두번째 j
//                if(j == 2) {
//                    break; // j가 2일 때, 안쪽 반복문이 종료.
//                }
//            }
//        }

        // continue(계속하다)
        int number = 0;
        while (number < 3){ // while문 ~하는 동안, 조건문 + 연산
            number++;
            if (number == 2){
                continue; // number가 2와 같으면 하위 조건으로 넘어가지 않고 연산을 계속한다.
            }             // 따라서 1출력! 과 3출력!만 나온다.
            System.out.println(number + "출력!");
        }

    }
}
