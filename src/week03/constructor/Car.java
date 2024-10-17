package week03.constructor;

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    // (1) 오버로딩
    public Car(String modelName) {
        model = modelName;
        System.out.println("첫 번째 생성자가 호출되었습니다.");
    }

    // (2)
    public Car(String modelName, String colorName) { // 문자열 문자열 타입의 생성자가 호출되었다.
        model = modelName;
        color = colorName;
        System.out.println("두 번째 생성자가 호출되었습니다.");
    }

    // (3)
    public Car(String modelName, String colorName, double priceValue) { // 문자열 문자열 더블 타입의 생성자가 호출되었다.
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세 번째 생성자가 호출되었습니다.");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }
}
