package week03.override;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 자동차 객체 생성
        Car car = new Car();
//        car.horn(); // 경적 , 실험삼아 주석 처리 했는데 정상 작동함  필요 없는거임

        System.out.println();
        // 자식 클래스 스포츠카 객체 생성
        SportsCar sportsCar = new SportsCar("Orion");

        // new sportsCar 객체의 오버라이딩한 brakePedal(), horn() 메서드 호출
        sportsCar.brakePedal(); // sportsCar 파일 안에 있는 brakePedal 의 () 값이다.
        sportsCar.horn(); // sportsCar 파일 안에 있는 horn 의 () 값이다.

    }
}

