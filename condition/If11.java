package condition;

public class If11 {
  public static void main(String[] args) {
    int price =10001;
    int age = 9;
    int discount = 0;
    if(price >= 10000) {
      discount += 1000;
      System.out.println( " 10000원 이상 구매 1000원 할인 ");
    }
    if( age <= 10 ) {
      discount += 1000;
      System.out.println( " 어린이 1000원 할인 ");
    }

    System.out.println( " 총 할인금액 : " + discount);
  }
}
