package week03.packageExample.main; // package

import week03.packageExample.pk1.Car; //

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // import 해서 Car class 에 접근 Car class 에는 plintln 이 있다.
        week03.packageExample.pk2.Car pkCar = new week03.packageExample.pk2.Car(); // import 로 이미 한번 pk1 class를 접근했음으로 pk2 에선 pk2의 전체 경로를 명시하여 Car class 에 접근한다.
        car.horn();  // pk1 빵~! 출력
        pkCar.horn(); // pk2 빵~! 출력
    }
}
