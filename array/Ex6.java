package array;

public class Ex6 {
  public static void main(String[] args) {
    // 반 2개 , 학생수 3명의 점수 관리
    // 행     , 열
    int[][] arr = new int[2][3];
    arr[0][0] = 80;
    arr[0][1] = 100;
    arr[0][2] = 70;

    arr[1][0] = 70;
    arr[1][1] = 80;
    arr[1][2] = 90;

    //2차원 배열 조회 (출력)
    for (int i = 0; i < arr.length; i++) { // 행 (반)
      for (int j = 0; j < arr[i].length; j++) { // 열(학생수)
        System.out.print(" arr["+i+"]["+j+"] : " + arr[i][j] );
      }
      System.out.println();
    } // for 1

    int totalSum = 0; // 총학생의 총점
    int totalNum = 0; // 총학생 수
    double totalAvg = 0.0;
    for (int i = 0; i < arr.length; i++) {
       totalNum += arr[i].length;
      for (int j = 0; j < arr[i].length; j++) {
       totalSum += arr[i][j] ;
      }
      } // for 2
      System.out.println(totalSum);
    totalAvg = (double) totalSum / totalNum;
    System.out.println( totalAvg);

    } // end main


  }
