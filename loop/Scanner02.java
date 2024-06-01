package loop;

import java.util.Scanner;

public class Scanner02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = 0;
    System.out.print(" 정수값 입력 : ");
    num = scanner.nextInt();
    if (num % 2 == 0) {
      System.out.println("입력한 정수 :" + num + " 짝수 ");
    } else {
      System.out.println("입력한 정수 :" + num + " 홀수 ");
    }
  }
}


/*
* 1. 정수값 입력받기 : num
 예) 정수를 입력하세요:3
결과 : 입력한 정수 3은 홀수
 예) 정수를 입력하세요:4
결과 : 입력한 정수 4은 짝수
* */