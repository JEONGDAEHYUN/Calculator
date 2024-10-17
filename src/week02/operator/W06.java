package week02.operator;

public class W06 {

    public static void main(String[] args) {

        // 대입연산자에서 주의해야 할 점!!
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + --b; // --b, b-- 값은 9로 같다 하지만 ++a의 값과 더할때는 값이 틀려진다.
        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 20
    }
}
