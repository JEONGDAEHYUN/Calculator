package week02.collection;

import java.util.Stack;

public class col3 {
        // Stack
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. FILO(Basket)
        // push, peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을때 사용
        public static void main(String[] args) {
            Stack<Integer> intStack = new Stack<Integer>(); // intStack 선언 및 <integer>() 함수로 new Stack 생성

            intStack.push(10);
            intStack.push(15);
            intStack.push(1);

            // 다 지워질 때 까지 출력(쌓은 값을 모두 출력한다.)
            while(!intStack.isEmpty()) { // isEmpty() 는 비어 있지 않음으로 false 를 return 한다. (바스켓이 비어 있으면 true 를 return 한다.)
                                         // !는 논리 부정 연산자로(not) 여기선 false 를 true로 바꾼다.
                System.out.println(intStack.pop()); // Stack 의 상단 값을 위로 빼준다.(pop)  출력값 1 15 10
            }

            // 다시 추가(모두 출력했던 값을 다시 쌓아준다.)
            intStack.push(10);
            intStack.push(15);
            intStack.push(1);

            // peak(하나만 뽑는다.)
            System.out.println(intStack.peek()); // 10 15 1 순서로 쌓여 있음으로 출력은 1이다.
            System.out.println(intStack.size()); // 10 15 1 임으로 크기는 3 이다.
        }
}
