package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        System.out.println("페달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D'); // car.gasPedal 메서드 호출
        System.out.println("speed = " + speed);

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
