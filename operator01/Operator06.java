package operator01;

public class Operator06 {
  public static void main(String[] args) {
    // 논리연산자 && , || , !
    int a = 10 , b =20 , c = 30;
    System.out.println( a > b && c > b ); // false && true 둘다 true 가 나오지않는한 무조건 false
    System.out.println( a < b && c > b ); // true && true => true
    System.out.println( a > b || c > b ); // false || true 둘 중 하나만 true 가나오면 true
    System.out.println( a < b && c > b ); // true || true  = > true
    System.out.println( !true );
    System.out.println( !false );

  }
}
