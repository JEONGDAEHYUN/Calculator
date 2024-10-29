package week03.poly;

public class HankookTire extends Tire { // 부모 클래스 상속

    public HankookTire(String company) {
        super(company); // 타이어 부모 클래스 호출
    }

    @Override
    public void rideComfort() { // Overriding 을 통해 Tire class 의 매서드를 재정의
        System.out.println(super.company + " 타이어 승차감은 " + 100);
    }
}
