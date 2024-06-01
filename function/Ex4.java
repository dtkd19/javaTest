package function;

import java.util.Scanner;

public class Ex4 {
  public static void make( int x, int y, String op ) {
//    System.out.println( x+op+y);
    int result = 0;
    // switch () 문
    switch (op) {
      case "+":
        result = x + y;
        break;
      case "-":
        result = x - y;
        break;
      case "*":
        result = x * y;
        break;
      case "/":
        result = x / y;
        break;
      case "%":
        result = x % y;
        break;
    }
    System.out.println( x + op + y + "=" +  result);
  }

    // 실행
    public static void main (String[]args) {

      Scanner scanner = new Scanner(System.in);
//    make(10,30,"+");
      System.out.print("정수1 >> ");
      int num1 = scanner.nextInt();
      System.out.print("정수2 >> ");
      int num2 = scanner.nextInt();
      System.out.print("연산자 >> ");
      // 엔터가 scanner.nextLine(); 들어간다 ? 해결방법
      scanner.nextLine(); // 엔터 받기 처리
      String opStr = scanner.nextLine();

      make(num1, num2, opStr);

  }
}
