package array;

public class Ex11 {
  public static void main(String[] args) {
    int a = 10;
    int b = a;
    // a 값을 b에 대입한다의 개념이 아니고
    // a 값을 복사해서 b에 대입한다
    System.out.println(b);

    //배열 : 참조형
    int[] oldArr ={10,20,30};
               // 메모리 시작값 x1000 주소
    // oldArr = [x1000, x1001, x1002 ]
    int[] newArr = new int[5];

    newArr = oldArr;
   // 값 수정
    oldArr[0] = 300;
    newArr[2] = 500;


    System.out.println(oldArr[0]);
    System.out.println(oldArr[1]);
    System.out.println(oldArr[2]);
    System.out.println("/////////////////");
    System.out.println(newArr[0]);
    System.out.println(newArr[1]);
    System.out.println(newArr[2]);
  } // main end
} // class end
