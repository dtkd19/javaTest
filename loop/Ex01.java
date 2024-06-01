package loop;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    // max , sum
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int sum = 0;
    System.out.print(" 정수 : ");
    max = scanner.nextInt();

    for ( int i = 0; i <= max ; i ++) {
      if(  i % 2 == 0 ) {
        sum += i;
      }
    } // end for
    System.out.println( " 총 짝수의 합은 : " + sum );
  }
}
