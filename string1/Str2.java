package string1;

public class Str2 {
  public static void main(String[] args) {
    // charAt()  : 해당 인덱스의 값을 하나만 꺼내온다.
    String str1 = "안녕하세요 홍길동입니다";
                 // 0 1 2 3 4
    // index : 0부터
    char s1 =str1.charAt(0);
    System.out.println( s1 );
    s1 =str1.charAt(1);
    System.out.println( s1 );
    s1 =str1.charAt(2);
    System.out.println( s1 );

    String ssn = "2405111111111";
     // 조건 뒷자리 첫글자 1, 3 남자, 2,4 여자, 그 외 형식잘못
    // switch ~ case
    // "" , ''
    char s2 = ssn.charAt(6);
    switch ( s2 ) {
      case '1','3' :
        System.out.println( " 남자입니다. "); break;
      case '2','4' :
        System.out.println( " 여자입니다. "); break;
      default:
        System.out.println( " 해당없음 ");
    }
  }
}
