package variable;
// 폴더 경로
public class Variable01 {
  public static void main(String[] args) {
    //type
    System.out.println("문자열 홍길동"); // 문자열 ""
    System.out.println(100); // 숫자
    System.out.println(true); // 논리값 true/false
    System.out.println('A'); // 문자 하나  ''
    System.out.println("A"); // 문자열로 인식

  }
}

/*
*  여러줄 주석
*  변수란 ?  변하는 값을 저장하는 저장 공간 (메모리)
*  예) 아이디, 비밀번호, 회원가입 양식? 이메일, 주민번호
*      상품명
*      상품개수,  가격, 총수량, 날짜 등  담아서 처리
*
*  변수명 규칙 ( 명명 )
*  1. 영문자, 숫자, _, $ 혼용 사용가능
*  2. 첫글자는 반드시 숫자 제외한 영문자
*     주로 영문자 소문자로 시작 ( 첫글자 대문자 클래스 헷갈리지않기위해)
*     한글 가능하다 ( 하지만 사용하지 말자 )
*  3. 한글, 예약어( if, for .. ), 특수문자 사용불가
*  4. 두단어가 합쳐질 경우
*      dogCat -> 낙타표기법 / 카멜케이스
*      myFirst
*      lastName
*      cartNum
*  5. 변수명 - 축약x , 내마음대로의 이름(나만알아보는 이름) x
*              내용에 맞는 영문작성 */
