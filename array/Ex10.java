package array;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println( "인원 수 입력 >> ");
    int num = scanner.nextInt();






    // 국 ,영 , 수
    // [인원수][과목]
   // int[][] scores = new int[4][3];
   int[][] scores = new int[num][3];
   // 과목 타이틀
   String[] subject = {"국어","영어","수학"};

   // 점수 입력
   for( int i = 0; i < scores.length; i ++){
     System.out.println( (i+1) + " 번 학생 입력");
     for (int j = 0; j < scores[i].length; j++) {
      // 과목
       System.out.print( subject[j]+ " 점수입력 >> ");
       scores[i][j] = scanner.nextInt();
     }
   } // end i


    //반복문 출력
    System.out.println();
    System.out.println("국어\t영어\t수학");
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        System.out.print(scores[i][j] + "\t");
      }

      System.out.println();
    }
// 총점 평균

    int totalSum = 0;
    double totalAvg =0.0;

    for (int i = 0; i < scores.length; i++) {
      totalSum = 0; // 각각의 총점
      for (int j = 0; j < scores[i].length; j++) {
        totalSum += scores[i][j];

      }

      totalAvg = totalSum / 3.0;
      System.out.println((i+1)+"번 학생의총점"+totalSum + " 평균은 " + totalAvg);
      System.out.println();
      }


  } // main end
} // class end

 /*
 인원수 외부 입력
국어, 영어, 수학
입력받기
[인원수][국영수점수]
[인원수][국영수점수]
조회(출력)
전체합계:xx
전체평균:xx */
