package condition;

public class If8 {
  public static void main(String[] args) { // 시작지점
  int num = 8;
  if(num == 1 ) {
    System.out.println( " 운동화 ");
  } else if (num == 3 ) {
    System.out.println( " 화장품");
  } else if ( num == 5 ) {
    System.out.println( " 구두 ");
  } else if (num == 9 ) {
    System.out.println( " 상품권 ");
  } else {
    System.out.println(" 꽝 다음기회에 ");
  }
  } // end main
} // end class


/*
* 경품추천
* 1: 운동화
* 3: 화장품
* 5: 구두
* 9: 상품권
* 그외 : 꽝 다음기회에*/
