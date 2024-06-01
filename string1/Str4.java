package string1;

public class Str4 {
  public static void main(String[] args) {
    String str1 = "김태균,김현우,유성혁,정태웅";

    System.out.println( str1.length());
    //배열 선언
    String[] arr = str1.split( ",");
    // arr[0] = "김태균"
    // arr[1] = "김현우"
    // arr[2] = "유성혁"
    // arr[3] = "정태웅"
    System.out.println( arr.length);
    System.out.println( arr[0]);
    System.out.println( arr[1]);
    System.out.println( arr[2]);
    System.out.println( arr[3]);

    String ssn = "240511-1111111";
   // 앞자리  Array, 뒷자리 Array
   // ssnArr
   String[] ssnArr = ssn.split("-");
    System.out.println(ssnArr[0]);
    System.out.println(ssnArr[1]);
  }
}



//String 객체를 지정한 구분자를 이용하여 여러 개의 문자열로 나눕니다. 문자열을 담은 배열.
