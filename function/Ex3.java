package function;

public class Ex3 {
  // 매개변수, 파라미터
  public static void sum(int x , int y) {
    int result = x + y;
    System.out.println( "결과 :" + result );
  }

  public static void sub(int x, int y) {
    int result = x - y;
    System.out.println( "결과 :" + result );
  }

  public static void mul(int x, int y) {
    int result = x * y ;
    System.out.println( "결과 :" + result );
  }

  public static void div(int x, int y) {
    double result = (double) x / y;
    System.out.println("결과 :" + result);
  }

  public static void mod(int x, int y) {
    int result = x % y;
    System.out.println( "결과 :" + result);
  }

  //실행
  public static void main(String[] args) {
    System.out.println("두 수의 합 : " );
    sum(10,30); // 호출
    System.out.println("두 수의 차 : " );
    sub(30,20);
    System.out.println("두 수의 곱 : " );
    mul(30,20);
    System.out.println("두 수의 몫  : " );
    div(30,10);
    System.out.println("두 수의 나머지 : " );
    mod(30,7);
  }
}
