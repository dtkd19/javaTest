package loop;

public class Type1 {
  public static void main(String[] args) {
//    자동 형변환
    int intNum = 20;
    double doubleNum ;
    doubleNum = intNum ; //  int => double
    System.out.println( "doubleNum : " + doubleNum );
//  명시적 형변환

    double num1 = 25.6;
    int num2;
    num2 = ( int ) num1;
    System.out.println(" num2 : " + num2 );

    int num3 = 10/3;
    System.out.println( " num3 : " + num3 );

    double num4 = 10/3;
    System.out.println( " num4 : " + num4 );

    double num5 = 10.0/3;
    System.out.println( " num5 : " + num5 );

    double num6 = 10/(double)3;
    System.out.println( " num6 : " + num6 );

    double num7 =(double) 10/(double) 3; // 비효율 둘중 하나만 바꿔서 사용해도 가능
    System.out.println( " num7 : " + num7 );
  } // main end
} // class end
