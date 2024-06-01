package loop;

public class For4 {
  public static void main(String[] args) {
    for ( int i = 1 , j =5 ; i <=4 ; i++ , j -- ) { // i : for {} 스코프
      System.out.println( i + " , " + j);
    }
    System.out.println();
    int x =2; // main 영역 스코프
    for ( ; x < 10 ; x ++) {
      System.out.print( x + " , "); // 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ,
    }
    System.out.println();
    System.out.print(" 최종 : " +  x );  // 최종 10

    // for ( ; ; ) : 무한루프 + if + break

     for ( int i = 0 ; i <= 5; i ++) {
       System.out.println( i + "번 :" + Math.random() );
     }
    System.out.println();
     // (int)( Math.random() * 범위 )
     // (int)( Math.random() * 2 ) => int ( 0.xxx ~ 1.xxx) = > 0 , 1
    for ( int i = 0 ; i <= 10; i ++) {
      System.out.println( i + "번 :" + (int)( Math.random() * 100  ));
    }

    // (int)(Math.random() * 범위 ) + 시작
    for ( int i = 0 ; i <= 10; i ++) {
      System.out.println( i + "번 :" + (int)( Math.random() * 5  ) + 5 );
    }

  }// end main
}
