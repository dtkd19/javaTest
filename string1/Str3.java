package string1;

public class Str3 {
  public static void main(String[] args) {
    // 중간값 꺼내올 때
    // substring(시작위치, 끝 ) => 끝 -1
    // substring(시작위치 ) => 시작위치부터 모두
    String str1 = "안녕하세요 홍길동입니다";
    String s1 = str1.substring( 0,2 );
    System.out.println(s1);

    s1 = str1.substring(1 , 5 );
    System.out.println( s1);

    s1 = str1.substring( 2);
    System.out.println( s1);

    String ssn = "2405111111111";
     // 년y 월m 일d
    String y = ssn.substring(0,2);
    System.out.println( " 년 " + y);
    String m = ssn.substring(2,4);
    System.out.println( " 월 " + m);
    String d = ssn.substring(4,6);
    System.out.println( " 일 " + d );

  } // end main


}
