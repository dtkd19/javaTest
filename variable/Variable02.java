package variable;

public class Variable02 {
  public static void main(String[] args) {
      int a = 10; // 선언과 동시에 초기화
      int b = 20;
      int c = 30;

      // 재할당
     b = 200;
     c = 300;
    //System.out.println("문자" + 변수);
    System.out.println("a :" + a);
    System.out.println("b :" + b);
    System.out.println("c :" + c);
  }
}

/*
*  타입 변수명 = 초기값 : 선언과 동시에 초기화
*  타입 변수명  - 선언
*  변수명 = 값  - 재할당
*
* 타입 변수명1 = 값 -선언과 동시에 초기화
* 타입 변수명1 = 값100 - 같은이름으로 선언 초기화 사용불가
*
* 타입 변수명2 = 값 -선언과 동시에 초기화
*  변수명2  = 값100 - 변수 재할당
 */