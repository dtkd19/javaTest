package operator01;

public class Operator07 {
  public static void main(String[] args) {
    // 증감연산자
    int x = 1, y = 1;
    x++; // x = x + 1 , x += 1
    ++x; // 앞에 붙어도 뒤어붙어도 혼자쓸때는 상관없다
    x++;
    ++x;
    --x; // x = x-1, x-=1
    System.out.println(x);

    int a = ++y + 10;
    System.out.println(a);
    System.out.println(y);
    x =1;
    int b = x++ + 10; // x +10 을 먼저 b 에대입하고 남아있는 x++ 값이 1증가해서 2가됨.
    System.out.println(b);
    System.out.println(x);
  }
}
