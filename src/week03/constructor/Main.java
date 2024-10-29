package week03.constructor;

public class Main {
    public static void main(String[] args) {

        // 기본 생성자 호출 오류 확인
        // Car car1 = new Car(); // 오류 발생

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 제네시스 자동차를 생산 : static final String COMPANY = "GENESIS"; 상수 고정
        // 모든 자동차는 생산시 기어의 최초 상태 'P' 로 고정 : char gear = 'P'; 직접 대입하여 초기화

        // GV60 모델만 기본으로 선택, car2 는 Car class 의 인스턴스 이다. car2는 객체이다.
        Car car2 = new Car("GV60"); // 문자열, ()괄호안 값인 생성자를 호출하여 보내준다
        System.out.println("car2.model = " + car2.model); // 생성자에서 반환된 model 값을 객체에 더해주고출력해준다.
        System.out.println("car2.gear = " + car2.gear + "\n"); // 필드 값 호출 후 객체가 반환된다.

        // GV70 모델, 색상 Blue 만 기본으로 선택
        Car car3 = new Car("GV70", "Blue"); // 문자열 문자열
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.gear = " + car3.gear + "\n");

        // GV80 모델, 색상 Black, 가격 50000000 으로 완전하게 고정된 경우
        Car car4 = new Car("GV80", "Black", 50000000); // 문자열 문자열 더블타입
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.price = " + car4.price);
        System.out.println("car4.gear = " + car4.gear + "\n");

    }
}
