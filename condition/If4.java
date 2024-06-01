package condition;

public class If4 {
  public static void main(String[] args) {
  int score = 89 ;
  if(score >= 0 && score < 60) {
    System.out.println( "재시험 ");
  }
  if(score >=60 && score < 70) {
    System.out.println( " 경고 ");
  }
  if(score >=70 && score <80 ) {
    System.out.println( " 통과 ");
  }
  if(score >=80  && score < 100 ) {
    System.out.println( " 1학기 프리패스 ");
  }
  }
}

/*
* 방식1 : 범위 : 비교 + 논리 연산자
점수 :
점수가 60미만 :재시험
60 ~ 70미만 : 경고
70 ~ 80미만 : 통과
80 ~ 100 : 1학기프리패스
* */
