package condition;

public class Switch2 {
  public static void main(String[] args) {
   int coupon , grade = 3;

   switch ( grade ) {
     case 1 : coupon =  3000 ; break;
     case 2 : coupon =  2000 ; break;
     case 3 : coupon =  1000 ; break;
     default: coupon =  500 ;
   }
    System.out.println( grade + " 등급 " +  coupon + " 원 " );
  } // main end
} // class end

/*
* * 회원 등급 쿠폰을 발급
 * 회원등급 ( 1, 2, 3 => grade )
 * 쿠폰 : coupon
 * 1등급 : 쿠폰 3000원
 * 2등급 : 쿠폰 2000원
 * 3등급 : 쿠폰 1000원
 * 그외
 * 500원
 * */
