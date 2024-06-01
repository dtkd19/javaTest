package loop;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print( " 입력 : ");
    String grade = scanner.nextLine();
    switch ( grade) {
      case "A" : grade = " A 입니다."; break;
      case "B" : grade = " B 입니다."; break;
      case "C" : grade = " C 입니다."; break;
    }
    System.out.println( grade);
  }
}
