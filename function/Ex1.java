package function;

public class Ex1 {
  // public static void 함수명(){} 정의 {
  public static void make() {
    // 자주 사용하는 코드를 함수에 정의
    System.out.println("안녕하세요");
    System.out.println("홍길동 입니다.");
    System.out.println("집주소는 인천입니다.");
    System.out.println("====================");
  }



  public static void main(String[] args) {
    System.out.println("메서드(함수) 호출전");
    // 함수명() - 호출
    make();
    make();
    make();
    System.out.println("메서드(함수) 호출완료");
    // 메서드(함수) 10번 ? for
    for (int i = 0; i < 10; i++) {
      make();
    }
  }
}


/*
 메서드 (다른언어 함수표현)
 사용자 정의
 자주사용하는 명령어를 담아두었다가 필요시 꺼내사용하기
 코드 재사용 ( 코드 줄이기 )
 */