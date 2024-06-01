package array;

public class Ex12 {
  public static void main(String[] args) {
    int[] oldArr ={10,20,30};
    int[] newArr = new int[5];

    // 복사 새로운 배열처리
    // 방법1
    /*
    for ( int i = 0 ; i < oldArr.length ; i ++) {
      newArr[i] =  oldArr[i];
    }
   */

    //방법2
    newArr = oldArr.clone();

    oldArr[0]= 100;
    newArr[2] = 500;

    System.out.println(oldArr[0]);
    System.out.println(oldArr[1]);
    System.out.println(oldArr[2]);
    System.out.println("/////////////////");
    System.out.println(newArr[0]);
    System.out.println(newArr[1]);
    System.out.println(newArr[2]);
  }
}
