package week03.inter1;

public class Main extends D implements C { // Main 이 D 에 상속된다. C는 Main 에 상속 된다.
// implements 는 class 와 interface 간의 관계를 정의한다.
    @Override //
    public void a() { // a를 A로 오버라이드 한다. (재정의)
        System.out.println("A");
    }

    @Override
    public void b() { // b를 B로 오버라이드 한다. (재정의)
        System.out.println("B");
    }

    @Override
    void d() {
        super.d(); // 부모 클래스 d() 호출하여 부모 값으로 재정의 한다., 호출된 값은 D 이다.
    }

    public static void main(String[] args) { // main 메서드로
        Main main = new Main(); // new 키워드로 객체를 생성한다.
        main.a(); // 오버라이드 하여 재정의 된 값 A 출력
        main.b(); // 오버라이드 하여 재정의 된 값 B 출력
        main.d(); // 오버라이드 하여 재정의 된 값 D 출력
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B { // 인터페이스 C 는 A, B 를 상속받는다. 그럼으로 C는 A, B를 포함한다.
}

class D {
    void d() {
        System.out.println("D");
    }
}