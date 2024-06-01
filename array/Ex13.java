package array;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maxMove = 10;
    String[] moveNames = new String[maxMove];
    int[] movePrices = new int[maxMove];
    int moveCount = 0;

    while (true) {
      System.out.println("1. 영화등록 2. 영화목록 3. 종료 메뉴를 고르시오 ");
      int menu = scanner.nextInt();
      scanner.nextLine();
      if (menu == 1) {
        if (moveCount > maxMove) {
          System.out.println(" 더이상 등록 불가 ");
          continue;
        }
        System.out.println(" 영화 이름 입력 ");
        moveNames[moveCount] = scanner.nextLine();
        System.out.println(" 영화 가격 입력 ");
        movePrices[moveCount] = scanner.nextInt();
        moveCount++;
      } else if (menu == 2) {
        if (moveCount == 0) {
          System.out.println(" 등록된 영화가 없습니다.");
          continue;
        }
        for (int i = 0; i < moveCount; i++) {
          System.out.println(moveNames[i] + movePrices[i]);
        }

      } else if (menu == 3) {
        System.out.println(" 종료 ");
        break;
      } else {
        System.out.println(" 잘못된 선택 ");
      }
    }
  }
}
