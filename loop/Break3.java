package loop;

public class Break3 {
  public static void main(String[] args) {
    int num = 0;

    while(true) {
      num = (int)(Math.random() * 50) +1;
      System.out.println( num);
      if(num == 30) {
        break;
      }
    }
  } // end main
}
