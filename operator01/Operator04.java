package operator01;

public class Operator04 {
  public static void main(String[] args) {
    // 관계 , 비교연산자
     int a = 10;
     int b = 20;
    System.out.println( a == b ); // false
    System.out.println( a != b ); // true
    System.out.println( a > b ); // false
    System.out.println( a < b ); // true
    System.out.println( a >= b ); // false
    System.out.println( a <= b ); // true
    boolean result = a > b;
    System.out.println( "결과 : " + result); // false

  }
}
