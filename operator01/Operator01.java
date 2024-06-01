package operator01;

public class Operator01 {
  public static void main(String[] args) {
    // 산술연산자 + - * / %
    // x, y, sum, sub, mul, div, mod
    int x,y;
    int sum,sub,mul,div,mod;

    x = 50;
    y = 7;

    sum = x+y;
    sub = x-y;
    mul = x*y;
    div = x/y; //  x/0 => 0으로 나눌 수 없다 Exception in thread "main" java.lang.ArithmeticException: / by zero
    // at operator01.Operator01.main(Operator01.java:16)

    mod = x%y;
   // double mod = (double) x/y => 형변환
   // double mod = x/(double)y
   // double mod = (double) x/(double)y

    System.out.println("합 :" + sum);
    System.out.println("차 :" + sub);
    System.out.println("곱 :" + mul);
    System.out.println("몫 :" + div);
    System.out.println("나머지 :" + mod);
  }
}

/*
* 연산자 ( 조미료 )
* 1. 산술연산자
*    사칙연산
*    + , -  , * , / , % :나머지
* 예 ) 5%2 -> 5를 2로나눈 나머지값 -> 1
* 2. 비교 (관계) 연산자
*  > , <  , >= , <= , == 같다 , != 다르다, 불일치
*  결과 : true / false , 참 / 거짓
* 3. 논리 연산자
*  && : and , 그리고 , 범위설정 , 두조건이 모두 만족할 때
*  || : or , 또는 , 둘중에 하나라도 맞았을 때 , 선택범위 밖에 영역처리 할 때
*  ! :  not , 부정
*      !true -> false
*      !false -> true
*
*      논쟁이 있는 부분이지만 책의 설명으로  정리
*             &&
*     true && true => true
*     true && false => false
*     false && true => false
*     false && false => false
*             ||
*     true || true => true
*     true || false => true
*     false || true => true
*     false || false => false
* 4. 대입(복합)연산자
*    변수 = 값 : 변수에 값을 대입 (치환)
*    a = a + 10  => a += 10
*    a = a - 10  => a -= 10
*    a = a * 10  => a *= 10
*    a = a / 10  => a /= 10
*    a = a % 10  => a %= 10  변수는 동일해야한다.
* 5. 증감연산자
*  ++ : + 1 증가
*  -- : - 1 감소
*    전위형
*   a =  ++x => x의 값을 1증가하고 a에 대입
*    후위형
*   a =  x++ => x의 값을 a에 대입하고나서 x 값  1증가
* 6. 삼항연산자
*  (조건)  ?  (참결과) : (거짓결과)  */
