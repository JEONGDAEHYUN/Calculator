package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B(); // new 키워드로 객체 생성, 객체 new B()는 a1 이다.
        a1.a(); // a1 이는 a() 이다.

        // a1은 인터페이스 A 타입(자동 형변환)이기 때문에, a() 메서드만 가지고 있음!!
        // a1.b(); // 불가능

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능
    }
}

interface A { // interface A 는 a 라는 추상 메서드를 정의
    void a(); // 추상은 메서드 이름만 가진다.(동작 없음)
}
class B implements A { // class B는 인터페이스 A를 구현
    @Override
    public void a() { // public 는 interface A 값
        System.out.println("B.a()"); // 오버라이드 하여 a() 를 구현
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B { // B를 C에 상속
    public void c() {
        System.out.println("C.c()");
    }
}