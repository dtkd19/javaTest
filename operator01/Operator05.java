package operator01;

public class Operator05 {
  public static void main(String[] args) {
    boolean result1,result2,result3;
    String str1 = "문자열1";
    String str2 = "문자열1";
    // result1 = str1 == str2 ; 주소 ,
    // 문자열비교는 == 사용하지 않는다.
    result1 = str1.equals("java");
    result2 = str1.equals("문자열1");
    result3 = str1.equals(str2);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }
}
