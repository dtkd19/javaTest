package loop;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print( " 이름 : ");
    String name = scanner.nextLine();
    System.out.print( " 나이 : ");
    int age = scanner.nextInt();
    System.out.print(" 국어 점수 :");
    int kor = scanner.nextInt();
    System.out.print(" 영어 점수 :");
    int eng = scanner.nextInt();
    System.out.print(" 수학 점수 :");
    int mat = scanner.nextInt();

    int total = kor + eng + mat;
    int avg = total/3;
    String hak;
    System.out.println( " 총점 :" + total);
    System.out.println( " 평균 :"+ avg);
    if( avg >= 90 ) {
      hak ="A";
    } else if ( avg >= 80) {
      hak = "B";
    }else if (avg >= 70){
      hak = "C";
    }else if (avg >= 60){
      hak = "D";
    } else {
      hak = " F";
    }
    System.out.println( " 학점 :" + hak);
    System.out.println(name + "님의 나이는 " + age + " 살이고" );
    System.out.println(" 총점은 " + total + " 이며 평균은 " + avg + " 학점은 " + hak +" 입니다.");

  }
}
