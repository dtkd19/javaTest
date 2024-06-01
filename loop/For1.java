package loop;

public class For1 {
  public static void main(String[] args) {
    // 동일코드(10줄) 연속(반복)으로 10번(50?) 실행 할 경우
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");
    System.out.println( " 안녕하세요 ");

    System.out.println( " ============================= ");
    for( int i = 1 ; i <= 10; i++ ) {
      System.out.println(" 지금은 1교시입니다.");
    }
    System.out.println( " ============================= ");
     int x = 0;
    System.out.println( "현재 값 : " + x );
    x++;
    System.out.println( "현재 값 : " + x );
    x++;
    System.out.println( "현재 값 : " + x );
    x++;
    System.out.println( "현재 값 : " + x );
    System.out.println( " ============================= ");

    for ( int j= 0 ; j <= 3; j++) {
      System.out.println( "현재 값 : " + j );
    }
    System.out.println( " ============================= ");
    //  1부터 10까지 k 출력하겠다.
    for ( int k= 1 ;  k <= 10;  k++) {
      System.out.println(k);
    }
      System.out.println( " ============================= ");
      for ( int k = 1 ; k <= 10 ; k = k+1) {
        System.out.println( k);
      }

  } // end main
} // end class
