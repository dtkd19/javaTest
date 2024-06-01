package variable;

public class Variable05 {
  public static void main(String[] args) {
    // 변수 선언
    String name,tel;
    int year, month , date ;
    boolean merried;

    // 값 할당
    name = "엄상훈";
    tel = "010-0000-1111";
    year = 2024;
    month = 4;
    date = 13;
    merried = false;
    System.out.println( "이름 :" + name );
    System.out.println(" 생일 :" + year + " 년  " + month + " 월  " + date + " 일 " );
    System.out.println( " 번호 : " +  tel);
    System.out.println( " 결혼유무 : " + merried);




  }
}

/*
* 변수선언 값을 재할당
*  이름 : name
*  년도 : year
*  월 : month
*  일 :  date
*  연락처 : tel
*  결혼 : merried
          논리 -  true / flase
   */