package week03.poly;

public class Tire { // 타이어 부모 class
    String company; // 타이어 회사, Tire class 필드(데이터)

    public Tire(String company) { // Tire class 생성자
        this.company = company; //  this 는 Tire
    }

    public void rideComfort() { // tire class 메서드
        System.out.println(company + " 타이어 승차감은?");
    }
}
