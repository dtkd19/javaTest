package operator01;

public class Operator08 {
  public static void main(String[] args) {
   String name = "홍길동";
   int kor = 80;
   int eng = 80;
   int mat = 80;
   int sum = 0;
   double avg = 0.0;

   sum = kor+eng+mat;
   avg = (double) sum/3;

    System.out.println("이름 :" + name);
    System.out.println(" 국어점수 :" + kor);
    System.out.println(" 영어점수 :" + eng);
    System.out.println(" 수학점수 :" + mat);
    System.out.println(" 세과목 총점 :" + sum);
    System.out.println(" 세과목 평균 :" + avg);

  int hour = 3;
  int minute = 5;
  // 시간 * 60 + 분 : 총분
   System.out.println( "3시 5분의 분 환산은 :" + (hour*60 + minute) + " 분입니다.");
  }
}
/*
이름 , 국어점수, 영어점수, 수학점수 의 합계와 평균구하기
변수 :  name, kor, eng, mat, sum, avg
name:문자열, kor:정수, eng:정수, mat:정수, sum:정수, avg:실수
* 결과 형식
이름 : xxx
국어점수 : xx
영어점수 : xx
수학점수 : xx
세과목 총점 : xx
세과목 평균 : xx
결과
이름 : 홍길동
국어점수 : 80
영어점수 : 80
수학점수 : 80
세과목 총점 : 240
세과목 평균 : 80.0

시간 : hour
분 : minute
예)
hour = 3
minute = 5 일경우
결과
3시 5분의 분 환산은 : 185 분입니다.
* */