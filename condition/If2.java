package condition;

public class If2 {
  public static void main(String[] args) {
    //1. 나이 (age) 18 이상이면  성인, 미성년 : String
    // 조건의 성격이 다를경우는 if문을 여러개 사용한다
    int age = 25;
    if (age >= 18) {
      System.out.println(" 성인 ");
    }
    if (age < 18) {
      System.out.println(" 미성년 ");
    }
  }
}
