package week03.instanceofSample;

// 다형성을 위한 클래스 정의
class Parent { } // Parent 클래스
class Child extends Parent { } // Child 클래스는 Parent 클래스를 상속
class Brother extends Parent { } // Brother 클래스도 Parent 클래스를 상속

public class Main {
    public static void main(String[] args) {

        // Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent(); // Parent 클래스의 인스턴스 생성

        // instanceof 연산자를 사용하여 p의 타입 확인
        System.out.println(p instanceof Object); // p는 Object의 인스턴스이므로 true 출력
        System.out.println(p instanceof Parent); // p는 Parent의 인스턴스이므로 true 출력
        System.out.println(p instanceof Child);  // p는 Child의 인스턴스가 아니므로 false 출력

        Parent c = new Child(); // Child 클래스의 인스턴스를 Parent 타입으로 참조

        // instanceof 연산자를 사용하여 c의 타입 확인
        System.out.println(c instanceof Object); // c는 Object의 인스턴스이므로 true 출력
        System.out.println(c instanceof Parent); // c는 Parent의 인스턴스이므로 true 출력
        System.out.println(c instanceof Child);  // c는 Child의 인스턴스이므로 true 출력
    }
}
