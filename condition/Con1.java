package condition;

public class Con1 {
  public static void main(String[] args) {
    // 0. 두개의 정수값중이 큰값을 출력
    //  a,b => 결과 max : type int
    int a = 30;
    int b = 20;
    int max = ( a > b) ? a : b ;

    System.out.println( " 최대값:\t" + max );
    // 1. 나이 (age) 18 이상이면 result1 : 성인, 미성년 : String
    // 2. 정수 (x) 2로 나눈 나머지가 0이면 짝수, 홀수
    // 3. 점수 (score) 80 이상이면 합격 , 불합격
    int age,x,score;
    age = 10;
    String result1 = ( age >= 18 ) ? "성인" : " 미성년자 " ;
    System.out.println( "결과:\t" + result1);
    x = 17;
    String result2 = ( x % 2 == 0 ) ?  " 짝수 " : " 홀수" ;
    System.out.println( "결과:\t" + result2);
    score = 90;
    String result3 = ( score >= 80 ) ? "합격" : " 불합격 ";
    System.out.println( "결과3 :\t " + result3 );

    // 4. y의 정수가 5의 배수인지 여부 5의배수다, 아니다
    int y = 20;
    String result4 = ( y % 5 == 0  ) ?  " 5의배수다 " : " 5의 배수가 아니다 " ;
    System.out.println( "결과4:\t" + result4);


  }
}

/*
* 삼항연산자
*  ( 조건식 ) ? 참결과 : 거짓결과
*  ( 조건식 ) ? 참결과 : (조건식) ?  참결과 : 거짓결과
*  ( 조건식 ) ? 참결과 : (조건식) ?  참결과 : (조건식) ?  참 : 거짓
   조건식 : 참, 거짓
   *      관계, 논리 + 산술 => true / false
* */
