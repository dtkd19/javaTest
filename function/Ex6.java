package function;


import java.util.Scanner;

public class Ex6 {

  public static boolean checkStr(String text, String str) {
// 단어가 포함되어있는지 여부 체크
    return text.toLowerCase().contains( str.toLowerCase());
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String txt = scanner.nextLine();

   //boolean isChk =  checkStr("Hello Java","Java");
    boolean isChk =  checkStr("Hello Java",txt);
    System.out.println( isChk );

 // 삼항
    String serch = ( isChk == true) ? "찾음"  : " 못찾음 ";

    System.out.println( serch );
    }
  }




/*

* public class Ex6 {
  public static boolean checkStr(String text, String str) {
// 단어가 포함되어있는지 여부 체크
    return text.toLowerCase().contains( str.toLowerCase());
  }


  public static void main(String[] args) {
   boolean isChk =  checkStr("Hello Java","Java");
    System.out.println( isChk );
    // if true = 단어 찾음, 단어를 찾을 수 없음
    if ( isChk == true ) {
      System.out.println( "단어 찾음" );
    } else  {
      System.out.println( " 단어를 찾을 수 없음");
    }
*/