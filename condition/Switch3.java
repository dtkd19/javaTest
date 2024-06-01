package condition;

public class Switch3 {
  public static void main(String[] args) {
    int coupon;
    int grade = 3;
    // if 문
    if ( grade >=1 && grade <=3) {
      System.out.println( grade + " 등급 / 쿠폰발급 " + " 3000원");
    } else  {
      System.out.println( grade + " 등급 / 쿠폰 발급 " + " 500원 ");
    }

  }
}
