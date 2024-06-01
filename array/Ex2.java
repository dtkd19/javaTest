package array;

public class Ex2 {
  public static void main(String[] args) {

   // String[] menus = new String[]{"불고기"."라면","피자","치킨","닭갈비"};
    String[] menus = {"불고기","라면","피자","치킨","닭갈비"};
   // int[] price =new int[]{6000,1100,28000,19000,8000};
   int[] price ={6000,1100,28000,19000,8000};
    //for 문

    for (int i = 0; i < menus.length; i++) {
      System.out.println(menus[i]+ "주문");
      // System.out.println(price[i] + " 원 " );
    }
    // for-each문 : 향상된 for문 => 값만출력
    for (String menu : menus) {
      System.out.println( menu + "주문");
    }
    for ( int price1 : price) {
      System.out.println( price1 + "원");
    }

    System.out.println("총 메뉴의 개수는 " + menus.length + "개 입니다.");


  } // end main
}


/*
*  // 문자열 데이터 5개 음식 메뉴 => 각각의 변수는 줄이거나 ? 코드 활용성?
    String menu1 = "불고기";
    String menu2 = "라면";
    String menu3 = "피자";
    String menu4 = "치킨";
    String menu5 = "닭갈비";

    System.out.println(menu1 + " 주문 ");
    System.out.println(menu2 + " 주문 ");
    System.out.println(menu3 + " 주문 ");
    System.out.println(menu4 + " 주문 ");
    System.out.println(menu5 + " 주문 ");

    System.out.println("총 메뉴의 개수는 " + 5 + "개 입니다.");*/

/*
* String[] menus = new String[5];
    // String menus[] = new String[5];

     menus[0] = "불고기";
     menus[1] = "라면";
     menus[2] = "피자";
     menus[3] = "치킨";
     menus[4] = "닭갈비";

    System.out.println(menus[0] + " 주문 ");
    System.out.println(menus[1] + " 주문 ");
    System.out.println(menus[2] + " 주문 ");
    System.out.println(menus[3] + " 주문 ");
    System.out.println(menus[4] + " 주문 ");

    System.out.println("총 메뉴의 개수는 " + menus.length + "개 입니다.");
  }*/