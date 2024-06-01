package condition;

public class Switch6 {
  public static void main(String[] args) {
    int num = 10;
    // 2로 나눈 나머지가 0 이면 짝수 , 홀수
    // 수식,  >= , <= if , 삼항연산자 추천
    // ( num % 2 == 0 ) ? " 짝수 " : " 홀수 "
    switch ( num % 2) {
      case 0 :
        System.out.println( " 짝수 ");
        break;
      default:
        System.out.println( " 홀수 ");
    }
  }
}
