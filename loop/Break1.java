package loop;

public class Break1 {
  public static void main(String[] args) {
    // 0 ~ 20  for문  i 10 이면 for 중단
    for( int i = 0 ; i <= 20; i++) {
      System.out.print( i + ", ");
      if( i == 10 ) {
        break;
      }
    }
  } // end main
}
