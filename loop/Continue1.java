package loop;

public class Continue1 {
  public static void main(String[] args) {
     for( int i = 0 ;  i < 20 ; i ++) {

       if( i % 2 == 1 ){
          continue; // for문 처음으로 이동 i ++
       }
       System.out.print(i + ", ");
     }

    System.out.println();

     for( int i = 0 ; i <= 10; i ++) {
       if ( i == 5 ){
         continue;
       }
       System.out.print( i + ", ");
     }
  } // end main
}
