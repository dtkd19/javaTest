package loop;

public class For5 {
  public static void main(String[] args) {
    // 이중 for문
    for( int i = 0; i < 5 ; i ++) {
      System.out.println( " ============i값============ : " + i);
      for(int j = 0; j < 5 ; j ++) {
        System.out.println(" i : " + i + " j: " + j);
      }
    }
    System.out.println();
    System.out.println( " =======================================");

    int count = 0; //  총 반복 횟수
    for( int i = 0 ; i <=3 ; i ++) {
      for( int j = 0 ; j <= 3 ;  j++ ){
        count ++;
      }
    }
    System.out.println( " 총 갯수 :  " + count);
    System.out.println();
    System.out.println( " =======================================");

    for (int i = 0;  i <= 5 ; i ++) {
      for (int j = 0;  j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  } // end main
}
