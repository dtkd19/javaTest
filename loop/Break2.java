package loop;

public class Break2 {
  public static void main(String[] args) {
    int x = 0;
    while (true) { // 무한반복
      System.out.println( x );
      if( x == 10 ){
        break;
      }
      x++;
    }
  } // end main
}
