package day06.ex05;

public class CalcTest {
  public static void main(String[] args) {
    Calc calc = new Calc();
    calc.calcon();
    int result1 = calc.sum(10,20);
    System.out.println(" 두수의 합 : " + result1 );
    int result2 = calc.sub(20,10);
    System.out.println(" 두수의 차 : " + result2 );
    int result3 = calc.mul(30,22);
    System.out.println(" 두수의 곱 : " + result3 );
    double result4 = calc.div(100,10);
    System.out.println(" 두수의 몫 : " + result4 );
    int result5 = calc.mod(100,11);
    System.out.println(" 두수의 나머지 : " + result5 );
    calc.calcoff();
  }
}
