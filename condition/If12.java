package condition;

public class If12 {
  public static void main(String[] args) {
    int price =10001;
    int age = 9;
    int discount = 0;
    if(price >= 10000) {
      discount += 1000;
      System.out.println( "10000원 이상 구매시 1000원 할인 ");
    } else if (age <= 10){
      discount += 1000;
      System.out.println( " 어린이는 1000원 할인 ");
    }
      // discount = ( price >= 10000 ) ? discount = 1000 : ( age <= 10 ) ? discount = 1000 : discount = 0;
    System.out.println( discount);
  } // main end
} // class end
