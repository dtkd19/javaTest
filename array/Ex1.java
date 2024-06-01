package array;
// 같은 타입의 데이터가 5개 있다.
public class Ex1 {
  public static void main(String[] args) {
 // 데이터가 들어오는 개수만큼 방크기 설정
    // String[] names = new String[]{"김현우","김태균","정태웅","배규대","김효준"};
    String[] names = {"김현우","김태균","정태웅","배규대","김효준"};


    names[0] = "김현우";
    names[1] = "김태균";
    names[2] = "정태웅";
    names[3] = "배규대";
    names[4] = "김효준";
 // for문 수정??  fori
    System.out.println( names[0] + "님 안녕하세요");
    System.out.println( names[1] + "님 안녕하세요");
    System.out.println( names[2] + "님 안녕하세요");
    System.out.println( names[3] + "님 안녕하세요");
    System.out.println( names[4] + "님 안녕하세요");

    for (int i = 0; i < names.length; i++) {
      System.out.println( names[i] + " 님 안녕하세요");
    }
  } // main end
} // class end

// Array : 같은 형의 데이터를 나열

// step1
/*
 String name1 = "김현우";
    String name2 = "김태균";
    String name3 = "정태웅";
    String name4 = "배규대";
    String name5 = "김효준";

    System.out.println( name1 + "님 안녕하세요");
    System.out.println( name2 + "님 안녕하세요");
    System.out.println( name3 + "님 안녕하세요");
    System.out.println( name4 + "님 안녕하세요");
    System.out.println( name5 + "님 안녕하세요");
    */

// step2
/*
 // 타입[] 배열명 = new 타입[개수];
    //String[] names = new String[5]; // 배열 선언 ( 공간설정 )
    // 배열명[인덱스] = "타입에 맞는 값";
    String names[] = new String[5];
    // 타입 배열명 [] = new 타입[개수]
    names[0] = "김현우";
    names[1] = "김태균";
    names[2] = "정태웅";
    names[3] = "배규대";
    names[4] = "김효준";

    System.out.println( names[0] + "님 안녕하세요");
    System.out.println( names[1] + "님 안녕하세요");
    System.out.println( names[2] + "님 안녕하세요");
    System.out.println( names[3] + "님 안녕하세요");
    System.out.println( names[4] + "님 안녕하세요");
*/