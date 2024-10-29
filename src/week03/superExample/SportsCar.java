package week03.superExample;

public class SportsCar extends Car{
    String engine;

    String model = "Ferrari"; // 자동차 모델
    String color = "Red"; // 자동차 색상
    double price = 300000000; // 자동차 가격

    public SportsCar(String engine) {
        this.engine = engine; // 매개 변수 값을 필드에 할당
    }

    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public void setCarInfo(String model, String color, double price) {
        super.model = model; // model은 부모 필드에 set, 부모의 모델을 바꿔주는것
        super.color = color; // color는 부모 필드에 set, 부모의 모델을 바꿔주는것
        this.price = price; // price는 자식 필드에 set
    }

    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}
