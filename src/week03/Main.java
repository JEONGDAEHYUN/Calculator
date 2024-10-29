package week03;

public class Main {
    public static void main(String[] args) { // public 은 공공의 라는 뜻으로 Car class 에서
        Car car = new Car(); // 객체 생성,Car 라는 객체를 생성해 줌으로써 instans화 할수 있다. 그리고 new 키워드를 사용할 수 있다.
                              //  new Car로 () Car calss의 생성자 호출
        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set 된다.

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값을 저장, 어디서 호출 하냐 Car class 에서 호출하고 car class 에서 input 및 output 되며 output 된 값이 ektl Car class로 반환(return) 되며 반환 값을 저장하게 된다.
        double speed = car.gasPedal(100, 'D'); // car.gasPedal 메서드 호출
        System.out.println("speed = " + speed); // 참조형 변수 car를 이용하여 외부에서 객체 내부의 필드에 접근할 수 있다. 외부 호출 시 car. 도트를 사용

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 밟고 난 후의 car.gear = " + car.gear); // 객체 필드 접근  car.gear

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150); // 입력된 스피드에 대해 로그값(입력된 값)을 출력
    }
}
