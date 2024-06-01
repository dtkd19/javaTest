package loop;

import java.util.Scanner;

public class Scanner01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );
    System.out.print(" 입력 : ");
    //String str = scanner.next();
    String str = scanner.nextLine();
    System.out.println("출력 : " + str);
    System.out.print(" 입력 : ");
    int num = scanner.nextInt();
    System.out.println("출력 : " + num );
  }
}
