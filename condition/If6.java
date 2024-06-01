package condition;

public class If6 {
  public static void main(String[] args) {
    // c변수에 숫자 -1 , 0보다 작다 , 100넘으면 범위초과 0~ 100 : 정상범위
    int c = 20;
    //if ( c < 0 || c> 100 ) {
    if (c <= -1 || c >= 101) {
      System.out.println(" 범위 초과");
    } else {
      System.out.println(" 정상 범위 ");
    }
    if( c>= 0 && c <=100 ) {
      System.out.println( " 정상범위 ");
    } else  {
      System.out.println( " 범위 초과");
    }
  }
}
