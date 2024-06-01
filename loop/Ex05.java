package loop;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = 0 , num2 = 0, num3 =0, result =0;
    String op= "";
    System.out.println( " 계산기 만들기");
    System.out.println( " =========================");
    while ( true ) {
      System.out.print(" 첫번째 정수 : ");
      num1 = scanner.nextInt();
      System.out.print(" 두번째 정수 : ");
      num2 = scanner.nextInt();
      System.out.println(" 연산자 선택 0 (종료) 1(+) 2(-) 3(*) 4(/) 5(%) ");
      System.out.print("  선택 ");
      num3 = scanner.nextInt();
      if ( num3 ==0 ){
        break;
      }
      switch (num3) {
        case 5:
          result = num1 % num2;
          op = " % ";
          break;
        case 4:
          result = num1 / num2;
          op = " / ";
          break;
        case 3:
          result = num1 * num2;
          op = " * ";
          break;
        case 2:
          result = num1 - num2;
          op = " - ";
          break;
        case 1:
          result = num1 + num2;
          op = " + ";
          break;
        default:
          System.out.println( " 형식이 잘못" );
      } // end switch
      if ( num3 >=1 && num3 <=5) {
        System.out.println(num1+op +num2 +" = "+ result);
      }
    } // end while
  } // end main
}
