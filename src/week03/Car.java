package week03;

// [우리가 클래스를 만들기 위해서는 4가지 STEP 이 필요합니다.]
//
// 1. 만들려고 하는 설계도를 선언합니다.(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정의합니다.
// 3. 객체를 생성하는 방식을 정의합니다.(생성자)
//      - constructor
// 4. 객체가 가지고 있어야할 행위(메서드)를 정의합니다.

public class Car { // 1. 클래스 선언 및 public 접근제어자
    // <필드 영역> 객체가 가지고 있어야할 필드를 정의합니다.

    // 1) 고유 데이터 영역

    String company; // 자동차 회사

    String model = "GV80"; // 자동차 모델

    String color; // 자동차 색

    double price; // 자동차 가격

    // 2) 상태 데이터 영역

    double speed; // 자동차 속도, km/h

    char gear; // 기어상태(P, R, N, D)

    boolean lights = true; // 자동차 조명의ㅣ 상태 // 2. 속성(필드) 정의
                           // true 로 디폴트 벨류를 잡아준다.
    // 객체 데이터 영역

    Tire tire = new Tire(); // 참조형 변수(주소형 변수)
// new 키워드를 줘서(초기값) instans 화 될때 해당 변수가 할당 및 참조가 될것 이다.
    Door door;

    Handle handle;

    // <생성자 영역>
    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!

    public Car () { // public(공공의) 으로 생성해 놓았기 때문에 다른 클레스에서 접근 가능하다.
        // logic
        // 기본생성자 : 생략이 가능
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    // <메서드 영역>

    // gasPedal
    // input : kmh
    // output : speed

    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다. 내부에서 메서드 호출 여기서 내부란 Car class 내부의 메서드 영역 즉 여기이다.
        speed = kmh; // 받아온 kmh로 잡아주고
        return speed; // 속도를 잡아서 return 해준다
    }

    // brakePedal
    // input : x
    // output: speed
    double brakePedal() { // 메서드 영역 brakePedal을 함수로 선언해 준다.
        speed = 0; // 위에서 () 빈 괄호 받아올것 없음 브레이크 밟으면 스피드 0
        return speed; // 0을 return 해준다.
    }

    // changGear
    // input : gear(char type)
    // output: gear
    char changeGear (char type) { // 메서드 영역 changeGear를 함수 선언  char형태를 return type으로 받는다.
        gear = type; // gear의 input 은 type 이다.
        return gear; // input 된 gear 를 받아서  output 해준다.
    }

    // onOffLight
    // input : x
    // output : lights(boolean)
    boolean onOffLights () { // boolean 타입은 true or false 이다.
        lights = !lights; // lights !(부정) 되어있다. 즉 false 꺼져 있다.
        return lights; //  선언된 lights 를  return 해준다. 어디다가 return 하느냐 하면 boolean 타입의 onOfflight에 return 해준다.
    }
    // horn
    // input : x
    // output : x
    void horn () { // horn은 경적으로 input 도 output 도 없다.  return 타입 없으면 void 쓴다.
        System.out.println("빵빵!"); } // 한가지 기능만 있기에 그렇다고 생각한다.

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double... speeds) { // return 타입이 아니면 void 를 쓴다. double... 가변배열 speeds가 여러형태가 들어온다.
        for (double v : speeds) { // 향상된 for문 speeds 는 v 이다.
            System.out.println("v = " + v); // v = 출력 되고 v값이 출력된다. 문자열은 "" 이다.
        }
    }

}
