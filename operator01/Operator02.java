package operator01;

public class Operator02 {
  public static void main(String[] args) {
    // + 더하기 , 문자열 연결
    String result1 = "test" + "java"; // 문자열 연결
    System.out.println(result1);
    String str1 = "string1";
    String str2 = "string2";
    String result2 = str1 + str2;
    System.out.println(result2);
    String str3 = 10 + 20 + "hi";
    System.out.println(str3);
    String str4 = 10 + "20" + 9;
    System.out.println(str4);
    String str5 = "10" + (30 + 20);
    System.out.println(str5);
    String str6 = "10" + 30 + 20;
    System.out.println(str6);
  }
}
