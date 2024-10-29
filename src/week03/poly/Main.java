package week03.poly;

public class Main {
    public static void main(String[] args) {

        // 부모 class 로 자동 형변환!, 자식 클래스 Tire 가 부모 클래스 Tire 로 형변환이 됨
        Tire kiaSampleTire = new KiaTire("KiA"); // 인스턴스화, new 키워드로 Tire 객체 생성
        Tire hankookSampleTire = new HankookTire("Hankook");

        // 매개변수 다형성 확인!
        Car car1 = new Car(kiaSampleTire); // Car class 부모
        Car car2 = new Car(hankookSampleTire);

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire(); // 강제 타입 변환

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100

    }
}