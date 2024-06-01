package loop;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = 0 , num2 = 0, num3 =0, result =0;
    String op = "";
    System.out.println( " 계산기 만들기");
    System.out.println( " =========================");
    while ( true ) {
      System.out.print(" 첫번째 정수 : ");
      num1 = scanner.nextInt();
      System.out.print(" 두번째 정수 : ");
      num2 = scanner.nextInt();
      System.out.println(" end , + ,- ,* ,/ ,% ");
      System.out.print( " 형식 ");
      scanner.nextLine();
      op = scanner.nextLine();
      if (op.equals("end")) {
        System.out.println(" 계산기 프로그램 종료 ");
        break;
      }


     switch (op) {
        case "%":
          result = num1 % num2;
          break;
        case "/":
          result = num1 / num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "+":
          result = num1 + num2;
          break;
        default:
          System.out.println( " 형식이 잘못" );
      } // end switch
      //if ( num3 >=1 && num3 <=5)
      {
        System.out.println(num1+op +num2 +" = "+ result);
      }
    } // end while
  } // end main
}