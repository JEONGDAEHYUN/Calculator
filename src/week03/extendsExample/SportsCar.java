package week03.extendsExample;

// 자식
public class SportsCar extends Car{
    String engine; // String 타입의 문자열 engine 을 넣어준다
    public void booster() { // booster 메서드, 부모에게 받은것에서 확장된것 extends
        System.out.println("엔진 " + engine + " 부앙~\n"); // 메서드 세부내용을 프린트
    }
}
