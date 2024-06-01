package condition;

public class If13 {
  public static void main(String[] args) {
    int price =10001;
    int age = 9;
    int discount = 0 ;
    if(price >= 10000  && age <= 10) {
      discount += 2000;
    } else if ( price >= 10000 || age <= 10) {
      discount += 1000;
    } else  {
      discount = 0 ;
    }
    System.out.println( discount );
  }
}
