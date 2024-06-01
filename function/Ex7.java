package function;

public class Ex7 {
  public static int count = 0;


  public static int getCount() {
    System.out.println("숫자 증가하기");
    return ++count ;
  }

  //실행

  public static void main(String[] args) {
    int cnt1 =  getCount();
    int cnt2 =  getCount();
    int cnt3 =  getCount();
    int cnt4 =  getCount();
    int cnt5 =  getCount();

    System.out.println(cnt1);
    System.out.println(cnt2);
    System.out.println(cnt3);
    System.out.println(cnt4);
    System.out.println(cnt5);

  }
}
