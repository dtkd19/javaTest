package array;

public class Ex5 {
  public static void main(String[] args) {
    // 다차원 배열 ( 2차원 배열 : 행,열 ) + 2중 for문

    String[] arrA ={"A1","A2","A3","A4"};
    String[] arrB ={"B1","B2","B3","B4"};
    String[] arrC ={"C1","C2","C3","C4"};
    // 1차원 배열을 여러개??

    // 3행 ,  4열 : 3 X 4
    String[][] arr = new String[][]{
      {"A1","A2","A3","A4"},
      {"B1","B2","B3","B4"},
      {"C1","C2","C3","C4"}
    };

    // 접근 : arr[행][열] 순서 인덱스 0부터
    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[2][2]);

    for (int i = 0; i < 3 ; i++) {
      //행
      for (int j = 0; j < 4 ; j++) {
        //열
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  } // main end
}
