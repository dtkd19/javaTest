package string1;

public class Str5 {
  public static void main(String[] args) {
    String str = "안녕하세요 저는 홍길동 입니다. 자바";
    String newStr = str.replace("자바", "java");
    System.out.println(newStr);

    //indexOf : 인덱스값 반환 , 값을 찾지못하면 -1 indexOf() 메서드는 호출한 String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환합니다. 일치하는 값이 없으면 -1을 반환합니다.
    // searchValue의 첫 번째 등장 인덱스. 찾을 수 없으면 -1.

    int idx1 = str.indexOf("안");
    System.out.println(idx1);

    idx1 = str.indexOf("홍길동");
    System.out.println(idx1);

    idx1 = str.indexOf("김고은");
    System.out.println(idx1);

    //true / false
    boolean str1 = str.contains("녕");
    System.out.println(str1);
    str1 = str.contains("고");
    System.out.println(str1);

    // 조건 : 자바 존재여부 indexOf => if : 자바찾음 / 자바못찾음
    // 조건 : 자바 존재여부 contains => if : 자바찾음 / 자바못찾음
    int idx2 = str.indexOf("자바");
    if (idx2 == -1) {
      System.out.println(" 자바못찾음");
    } else { // idx2 != -1 , idx2 > -1
      System.out.println("자바찾음");
    }
    boolean str2 = str.contains("자바");
    if(str2 == true) { // str2 true 생략가능
      System.out.println("자바찾음");
    }else {
      System.out.println("자바못찾음");
    }
    // 영문은 대소문자 구별한다.
    String text1 = "naver Dog Cat good daum eZen Nate Java";
    // 1. 해당 문자열을 대문자 또는 소문자로 변환 ( 소문자로 )
    // 2. 찾는 글자를 대문자 또는 소문자로 변환 ( 소문자로 )
    // 1에 2번 있는지 체크 : indexOf , contains
    // if문
    String text2 = text1.toLowerCase();
    int idx3 = text1.indexOf("cat");
    System.out.println(idx3);
    // String newText1 = "cat".toLowerCase();
    String newText1 = "cat";
    int idx4 = text2.indexOf(newText1.toLowerCase());
    if (idx4 == -1) {
      System.out.println("없다");
    }else {
      System.out.println("있다");
    }
    boolean str3 = text2.contains(newText1.toLowerCase());
    if(str3) {
      System.out.println( " 있다 ");
    } else {
      System.out.println(" 없다 ");
    }

  } // end main
}
