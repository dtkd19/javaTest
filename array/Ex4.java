package array;

public class Ex4 {
  public static void main(String[] args) {
    // 정수형 scores 배열 값 5개의 점수 총점과 평균
    int[] scores = {30,40,50,60,70};
    int sum = 0;
    double avg = 0.0;
    for (int i = 0; i < scores.length; i++) {
      //sum = sum + scores[i];
      sum  += scores[i];
    } // end for
    System.out.println( "총점 : " + sum );

   //  avg = sum / 5.0;
    avg = (double) sum / scores.length;
    System.out.println( "평균 : " + avg);
  } // end main
}
