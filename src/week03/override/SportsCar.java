package week03.override;

public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public SportsCar(String engine) {
        this.engine = engine;
    }

    // @ : 애노테이션(annotation), 오버라이드 : 부모가 가진 메서드 재정의(행동 변경 및 확장 extend)
     @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed; // 100 값이 다시 return 된다.
    }
   // @ : 애노테이션(annotation), 오버라이드 : 부모가 가진 매서드 재정의(행동 변경 및 확장 extend)
    @Override
    public void horn() {
        booster();
    }
}
