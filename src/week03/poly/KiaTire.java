package week03.poly;

public class KiaTire extends Tire{ // 부모 클래스 상속

    public KiaTire(String company) { // 생성자(변수)
        super(company); // super 라는 매개 변수를 통해 부모 클래스의 생성자를 명시
                        // 타이어 부모 클래스 호출
    }

    @Override
    public void rideComfort() { // Overriding 을 통해 Tire class의 메서드를 재정의
        System.out.println(super.company + " 타이어 승차감은 " + 60);
    }
}