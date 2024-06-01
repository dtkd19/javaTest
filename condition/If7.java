package condition;

public class If7 {
  public static void main(String[] args) {
    // 문자열 비교
    int age = 10;
    String addr = " 인천 ";
    if (age >= 16 && addr.equals(" 인천 ")) {
      System.out.println(" 가입가능 ");
    } else {
      System.out.println(" 가입 불가능 ");
    }
  }
}