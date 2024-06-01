package loop;

public class For2 {
  public static void main(String[] args) {
    // 0~20 까지 짝수만 출력 : for + if
    for ( int i = 0 ; i <= 20 ; i ++) {
      if( i % 2 == 0 ) {
        System.out.print( i + "\t");
      }
    }
    System.out.println( " ============================= ");
    for ( int i = 0 ; i <= 20; i = i+2){
      System.out.print( i + " \t ");
    }
    System.out.println( " ============================= ");
    // 0~20 까지 홀수만
    for ( int i = 0; i <=20 ; i ++){
      if( i % 2 == 1) { // if( i % 2 != 0
        System.out.print( i + " \t ");
      }
    }
    for ( char ch = 'a' ; ch <= 'z' ; ch ++) {
      System.out.print(ch + "\t");
    }
    System.out.println( " ============================= ");

    for ( int i = 1; i <= 100; i ++){
      System.out.print( i + "\t");
      // 10의 나눈 나머지 0이면
      if( i % 10 == 0 ) {
        System.out.println();
      }
    }

  } // end main
}// end class
