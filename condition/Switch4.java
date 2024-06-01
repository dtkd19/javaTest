package condition;

public class Switch4 {
  public static void main(String[] args) {
    int x = 9;
    String y = null;
    // if ( x == 1 || x ==2 )
    switch ( x ) {
      case 1,2 : y = " 1,2이다. " ; break;
      case 3,5,9 : y = " 3,5,9이다. " ; break;
      case 4 : y = " 4이다. " ; break;
      case 6 : case 8 : case 7 : y = " 6,7,8이다. " ; break;
      default: y = " 값없음" ;
    }
    System.out.println( y );
  }
}
