package week03.parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성





        // 기본형 매개변수
        char type = 'D'; // 기본형 매개변수는 값이 복사되어 넘어가는 거라(주소 아님) Car class 에서 매개값으로 지정된 변수의 원본 값이변경되지 않는다.
        car.brakePedal(type);
        // 메서드 실행 완료 후 전달할 매개값으로 지정된 type 값 확인
        System.out.println("type = " + type); // 기존에 선언한 값 'D' 출력, 원본 값 변경되지 않음
        // 메서드 실행 완료 후 Car class에 반환된 car 인스턴스의 gear 타입 확인
        System.out.println("gear = " + car.gear); // 객체 내부에서 type을 변경하여 수정했기 때문에 'P' 출력
// 기본형과 참조형의 틀린 점을 간단히 적어보면 매개변수(){} 기본형은 (), 참조형은 {} 안에서 호출한것이 순서의 차이를 만들었기 때 문이다. 원본 객체를 호출해야 값이 바뀐다.





        System.out.println();
        // 참조형 매개변수
        Tire tire = new Tire(); // Main 객체를 new키워드로 인스턴스화 하여 tire 를 선언하였다.
        tire.company = "금호"; // 금호 타이어 객체 생성

        // 차 객체의 타이어를 등록하는 메서드 호출한 후 반환값으로 차 객체의 타이어 객체 반환
        Tire carInstanceTire = car.setTire(tire); // setTire (객체)가 carInstanceTire 선언, 인스턴스화 되었다.
                                                  // 즉 금호가 객체(KIA)로 carInstanceTire 선언되며 대체되었다.
        // 메서드 실행 완료 후 전달할 매개값으로 지정된 참조형 변수 tire의 company 값 확인
        System.out.println("tire.company = " + tire.company); // "KIA" 출력, 바로 위에서 객체로부터 주소값을 받아서 인스턴스화 되었다.
        // 전달할 매개값으로 지정된 tire 인스턴스의 주소값이 전달되었기 때문에 호출된 메서드에 의해 값이 변경됨.

        // 메서드 실행 완료 후 반환된 car 인스턴스의 tire 객체 값이 반환되어 저장된 참조형 변수 carInstanceTire의 company 값 확인
        System.out.println("carInstanceTire.company = " + carInstanceTire.company); // "KIA" 출력
    }
}
