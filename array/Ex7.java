package array;

public class Ex7 {
  public static void main(String[] args) {
    // 개수가 다를경우
    // String[][][] arr = new String[3][3][3];
    String[][] arr = {
        {"A1","A2","A3"},
        {"B1","B2","B3","B4","B5"},
        {"C1","C2","C3","C4","C5","C6","C7","C8"}
    };
    for (int i = 0; i < arr.length; i++) { //행
      for (int j = 0; j < arr[i].length; j++) { //열
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  } // end main
}
