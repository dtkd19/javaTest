package condition;

public class If14 {
  public static void main(String[] args) {
    int num1 = 123;
    if (num1 % 2 == 0) {
      if (num1 >= 100) {
        System.out.println(" 짝수이면서 100 이상");
      } else {
        System.out.println(" 짝수이면서 100 미만 ");
      }
    } else {
      if (num1 >= 100) {
        System.out.println(" 홀수이면서 100이상");
      } else {
        System.out.println(" 홀수이면서 100 미만");
      }
    }
  }
}
