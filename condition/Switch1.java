package condition;

public class Switch1 {
  public static void main(String[] args) {
  int num = 9;
  String result = "" ;
  switch ( num ) {
    case 1 : result = "운동화" ; break;
    case 3 : result = "화장품" ; break;
    case 5 : result = " 구두" ; break;
    case 9 : result = " 상품권" ; break;
    default: result = " 꽝 다음기회에" ;
  }
    System.out.println( "결과 : " + result);
  }
}


/*
 조건분기형
 if ==    ,    case 값
 >, < ..   /   같은값 처리  => 처리속도

*  switch ( 변수 ) { 변수, 대상, 식
    case 값 : 실행문 ; break;
    case 값 : 실행문 ; break;
    case 값 : 실행문 ; break;
    case 값 : 실행문 ; break;
    defalut : 실행문;
 }
 * */
