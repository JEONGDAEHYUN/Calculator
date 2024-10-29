package week03.poly;

public class Car {
    Tire tire; // 필드

    public Car(Tire tire) { // 생성자, Tire 는 Car 에 포함
        this.tire = tire; // Car 의 tire 는 tire 이다.
    }

    Tire getHankookTire() { // Tire
        return new HankookTire("HANKOOK"); // new 키워드로 객체 생성
    }                                               // return 메인 메서드에 반환

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}
