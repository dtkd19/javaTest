package array;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    // 점수를 4개 입력받기 arr
   // 배열 선언
    int cnt = 4;
    int[] arr =new int[cnt];

    Scanner scanner = new Scanner(System.in);
    System.out.println( " 몇개를 입력하시겠습니까? : ");
    cnt = scanner.nextInt();
    System.out.println( " 점수를 입력 : ");
    for (int i = 0; i < cnt; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println();
    // 총점 평균
    int sum = 0;
    int num = 0;
    double avg = 0.0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println( "총점 :" + sum );
    avg = (double) sum / arr.length;
    System.out.println("평균 :" + avg);
    } // main end
  }

  /*
  * int[] arr = new int[4];

    Scanner scanner = new Scanner(System.in);
    System.out.println( " 점수 4개 입력 : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    // 출력 for 문
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if ( i < arr.length -1 ) {
        System.out.println( " , " );
      }
      }
    System.out.println();
    // 총점 평균
    int sum = 0;
    int num = 0;
    double avg = 0.0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println( "총점 :" + sum );
    avg = (double) sum / arr.length;
    System.out.println("평균 :" + avg);*/