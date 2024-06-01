package condition;

public class Switch5 {
  public static void main(String[] args) {
    String result = "" ;
    int month = 7;
    switch ( month ) {
      case 3 : case 4 : case 5 : result = " 봄 " ; break;
      case 6,7,8 : result = " 여름" ; break;
      case 9,10,11 : result = " 가을" ; break;
      case 12 : case 1 : case 2  : result = "겨울 " ; break;
      default: result = " 해당계절 없음" ;
    }
    System.out.println( "계절:\t" + result);
  } // main end
} // class end
