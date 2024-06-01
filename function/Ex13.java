package function;


//재귀함수 -> 자기자신을 호출하는 방식
//

public class Ex13 {
  public static void make(int num) {
    System.out.println(num);
    if( num <10){
      make(++num); // 자신의 메서드내에서 자신을 다시 호출
    } else{
      System.out.println("==end==");
    }
  }

 // 재귀함수 = 팩토리얼
 public static int fac(int num) {
   System.out.println(num);
   return num == 0 ? 1 : num* fac(--num);
 }


  public static void main(String[] args) {

    int fac1 = fac(1);
    System.out.println("-----------------");
   int fac2 = fac(2);
    System.out.println("-----------------");
   int fac3 = fac(5);
    System.out.println( fac1);
    System.out.println( fac2);
    System.out.println( fac3);

    /*
    make(5);
    System.out.println("--------------------");
    make(3);
    System.out.println("---------------------");
    make(6);
    /*make(5);

     */
  }
}
