package function;

public class Ex2 {
  public static void make() {
    System.out.println( "안녕하세요 인사 호출");
    //생략
    return;
  }


  // 실행
  public static void main(String[] args) {
    System.out.println("메서드 호출 전");
    make();
    make();
    System.out.println("///////////////////");
    make();
    System.out.println("메서드 호출 후");
  }  // end main
} // end class
