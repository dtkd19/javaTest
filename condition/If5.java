package condition;

public class If5 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    if (a > b) {
      System.out.println(" 최댓값 : " + a);
    } else {
      System.out.println(" 최댓값 : " + b);
    }
    // 문제2
    int age = 25;
    if (age >= 18) {
      System.out.println(" 성인 ");
    } else {
      System.out.println(" 미성년 ");
    }
    //문제3
    int x = 17;
    if (x % 2 == 0) {
      System.out.println(" 짝수 ");
    } else {
      System.out.println(" 홀수 ");
    }
    //문제4
    int score = 88;
    if (score >= 80) {
      System.out.println(" 합격 ");
    } else {
      System.out.println("불합격 ");
    }
    //문제 5
    int y = 21;
    if (y % 5 == 0) {
      System.out.println(" 5의 배수다. ");
    } else {
      System.out.println(" 5의 배수가 아니다. ");
    }

    // z = 숫자 ( 0 , 10 - 10 )
    // 1. 단일 if 문 양수  / 음수 / 0 입니다.
    // 2. if ~ else 0,10 : 양수  / - 10  :음수
    int z = -10;

    if (z > 0) {
      System.out.println(" 양수입니다. ");
    }
    if (z < 0) {
      System.out.println(" 음수입니다. ");
    }
    if (z == 0) {
      System.out.println(" 0입니다. ");
    }
    if( z == 0 || z > 0 ) {
      System.out.println( " 양수 ");
    } else {
      System.out.println( " 음수 ");
    }
  }
  }

/*
* 결과의 경우의 수가 2개일때
*
1. 두개의 정수값중이 큰값을 출력하시오 a , b => 결과 max : type int
2. 나이(age) 18이상이면 result1 :성인, 미성년 : String
3. 정수(x) 2로 나눈나머지 0면 짝수, 홀수
4. 점수(score) 80이상이면 합격, 불합격
5.  y의 정수가 5의 배수 인지 여부 5의 배수 5의 배수가 아니다
* */