package condition;

public class If10 {
  public static void main(String[] args) {
    double rating = 8.1;
    String result = ( rating <= 10 && rating > 9  ) ? " 파묘 " : (rating <=9 && rating > 8) ?
        " 아쿠아맨 " : (rating <=8 && rating >7) ? " 파묘 " : " 아무거나 추천";
    System.out.println( " 추천 : " + result);

    // 삼항 연산자

  } // main end
} // class end

/*
* 문제 )
1. 다중 if문
평점 : rating = 8.1
평점이 7 이상이면 범죄도시 추천
평점이 8 이상이면 아쿠아맨 추천
평점이 9 이상이면 파묘 추천
그외 랜덤추천
2. 삼항 연산자로 해보실수 있으시면 해보세요 */

/*
* double rating = 8.1;
    if ( rating <= 10) {
      System.out.println(" 범죄도시 ");
    }  if ( rating <= 9) {
      System.out.println(" 아쿠아맨 ");
    }  if (rating <= 8) {
      System.out.println(" 파묘 ");
    }  if (rating <7) {
      System.out.println( " 아무거나 추천 ");
    }*/

/*
* double rating = 6.1;
    if ( rating <= 10 && rating > 9) {
      System.out.println(" 범죄도시 ");
    } else if ( rating <= 9 && rating >8) {
      System.out.println(" 아쿠아맨 ");
    } else if (rating <= 8 && rating > 7) {
      System.out.println(" 파묘 ");
    } else {
      System.out.println( " 아무거나 추천 ");
    }*/