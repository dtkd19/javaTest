package condition;

public class If3 {
  public static void main(String[] args) {

   /*
  if(age >= 0 && age <= 7) {
      System.out.println( " 미취학 ");
    }
  if(age >=8 && age <= 13 ) {
    System.out.println( " 초등학생 ");
  }
  if(age >= 14 && age <= 16 ){
    System.out.println( " 중학생 " );
  }
  if(age >= 17 && age <= 19){
    System.out.println( " 고등학생 " );
  }
  if(age >= 20){
    System.out.println( " 성인 ");
  }
*/
    int age = 9;
    if(age <= 7) {
      System.out.println( " 미취학 ");
    }
    if(age <= 13 ) {
      System.out.println( " 초등학생 ");
    }
    if(age <= 16 ){
      System.out.println( " 중학생 " );
    }
    if(age <= 19){
      System.out.println( " 고등학생 " );
    }
    if(age >= 20){
      System.out.println( " 성인 ");
    }

  }
}


/*
* 나이 age
~ 7세 : 미취학
8 ~ 13 : 초등학생
14 ~ 16 : 중학생
17 ~ 19 : 고등학생
20 ~ : 성인
단 범위 비교 + 논리 연산자 사용  */
