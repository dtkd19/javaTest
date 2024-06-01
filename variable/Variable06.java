package variable;

public class Variable06 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp ;
    System.out.println(" 교환 전 : a : " + a +  " / b :" + b );
    // 값을 교환하는 원리
    temp = a;
    a = b;
    b = temp ;
    System.out.println(" 교환 후 : a : " + a +  " / b :" + b );
  }
}
/*
a = 10
b = 20
두개의 값을 교환하시오
temp 변수 만들기
1. a 의 값을 temp 넣고
2. b 값을 a에 넣어주고
3. temp값을 b에 넣어주세요
*/

