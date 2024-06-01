package operator01;

public class Operator03 {
  public static void main(String[] args) {
    // 대입연산자 =
    int x,y;
    x = 10; //대입
    y = 20; //대입
    // x = x+y;
     x += y;
    System.out.println("결과1 :" + x );

     // x = x-y;
     x -= y;
    System.out.println("결과2 :" + x );

    //  x = x*y;
     x *= y;
    System.out.println("결과3 :" + x );

    // x = x/y;
     x /= y;
    System.out.println("결과4 :" + x );
     // x = x%y;
     x %= y;
    System.out.println("결과5 :" + x );
  }
}
