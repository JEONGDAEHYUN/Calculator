package week03.extendsExample;

// 부모
public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        Car car = new Car();
        // car.engine = "Orion"; // 자식 class 에서 가져와서 오류
        // car.booster(); // 자식 class 에서 가져와서 오류

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar(); // 선언
        sportsCar.engine = "Orion"; // 참조
        sportsCar.booster(); // Car class 에서 호출

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        sportsCar.company = "GENESIS";
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println();

        sportsCar.horn();
        System.out.println(sportsCar.changeGear('D'));
    }
}
