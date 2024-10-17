package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char / 1byte), 문자열(String)
        // string = char[] -> string은 char를 []배열로서 만든것이다.

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
        // - Wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(=주소형 변수)

        // char < String(훨씬 더!)
        // String이 가지고 있는 기능이 너무 많아서.!!!
        // Wrapper class와도 상당히 비슷.! -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로써, 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength); // Length 즉 길이 임으로 "ABCD" 의 길이 4 이다.

        // (2) charAt(입력값 int index)
        char strChar = str.charAt(1); // str 값은 "ABCD" 이고 charAt() 의 함수에 1이 입력 되었음으로 1번째는 즉 B 이다.
        System.out.println(strChar);

        // (3) substring(입력값 int fromIndx, int toIdx) substring 의 뜻은 string 을 자르겠다.
        String strSub = str.substring(0, 3); // substring 안에 입력값이 int fromIndx 아님 int toIdx 라는것 같다??????????
        System.out.println(strSub); // str 값은 "ABCD" 이고 substring(0, 3) 함수 값 0번째 부터 3번째 전값 즉 D값을 포함하지 않은 ABC 이다.

        // (4) equals(String str) equals 는 어떠한 String이 입력으로 받은 String str과 같니? 라고 질문하는것, true 또는 false 값이 retun 된다.
        String newStr = "ABCE"; // "ABCE" 값을 newStr 이라 선언
        boolean strEqual = newStr.equals(str); // strEqual 이 true or false? (선언), newStr(위에서 할당) 값은 str 값과 같니(equals)?
        System.out.println(strEqual); // strEqual 을 println() 함수에 참조 하여 값을 출력하면 false 이다.

        // (5) toCharArray() : String -> char[], String을 char로 이루어진 []Array로 변환하는 메서드 이다.
        char[] strCharArray = str.toCharArray(); // char로 이루어진 []Array인 strCharArray 를 변수를 선언한다.

        // (6) 반대로 char[] -> String -> char,  char []Array 를 String 형태로 선언 해주고 char 형태로 변환해준다.
        char[] charArray = {'A', 'B', 'C'}; // char[] 즉 char Array 형태로 되어있는 변수를 charArray 로 선언한다.
        String charArrayString = new String(charArray); // charArray 를 new String() 함수에 할당해주고 charArrayString 으로 선언한다.
        System.out.println(charArrayString); // charArraySrring 을 Prinstln() 함수에 참조 하여 값을 출력하면 ABC 문자열 형태로 변환된다.
    }
}
