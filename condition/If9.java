package condition;

public class If9 {
  public static void main(String[] args) {
    int age = 17;
    //String result = null;
    String result = "";

    if(age <= 7) {
      result = " 미취학 " ;
    } else if (age >= 8 && age <= 13) {
      result =  " 초등학생 " ;
    } else if (age >= 14 && age <= 16) {
      result = " 중학생 " ;
    } else if (age >= 17 && age <= 19) {
      result = " 고등학생 " ;
    } else {
      result = " 성인 " ;
    }
    System.out.println( " 결과 : " + result);
  }
}
/*
* 1. 자바는 처음실행시
     실행 에러의 경우의 수가 없어야한다.
     블럭단위로 실행시 경우의 수가 모두 존재해야한다.
     조건에 따라 블럭단위로 실행

     다중 if 문 반드시 else 문 존재
     변수 = 초기값  존재
     result = " "
     result = " null
 */
