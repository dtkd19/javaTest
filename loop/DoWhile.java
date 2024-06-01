package loop;

public class DoWhile {
  public static void main(String[] args) {
    // 무조건 1번은 실행 - 조건에 만족하지 않을 때
    int x =  0;
    do {
      System.out.println( x );
      x++;
    } while ( x > 10 );
  }
}
