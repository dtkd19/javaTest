package loop;

public class While01 {
  public static void main(String[] args) {
    // 0~ 10 까지 출력하겠다
    int x = 0; //시작
    while (x <= 10) { //조건식
      System.out.print(x + ", "); //실행
      x++; // 증감식
    }
    System.out.println();
    System.out.println("===============================");
    // 0~20 까지 짝수 y
    // 0~20 까지 홀수 z
    int y = 0;
    System.out.print(" 짝수 : ");
    while (y <= 20) {
      if (y % 2 == 0) {
        System.out.print(y + " ");
      }
      y++;
    }
    System.out.println();
    System.out.println("===============================");
    int z = 0;
    System.out.print(" 홀수 : ");
    while (z <= 20) {
      if (z % 2 == 1) {
        System.out.print(z + " ");
      }
      z++;
    }
    System.out.println();
    System.out.println("==============================");
    // i sum = 누적값 0 ~ 10 까지
    int i = 0;
    int sum1 = 0;
    while (i <= 10) {
      sum1 = sum1 + i; // sum += i;
      System.out.print(sum1 + " ");
      i++;
    }
    System.out.println();
    System.out.println(" 0 ~ 10 까지의 합 : " + sum1);
    System.out.println();
    System.out.println("==============================");

   /* int z = 0 ,  max = 30, sum1 = 0 ;
    while ( z <= max) {
      sum1 = sum1 + z; // sum1 += z
      System.out.println(" sum1 " + sum1 + "/z :" + z);
      z++;
    }
    System.out.println( " sum1 " + sum1 + "/z :" + z);

   */
  } //main end
}
