package function;

public class Ex11 {
  // 펼침연산자, 나머지연산자, 스프레드연산자 ... 변수
 // 나머지연산자는 매개변수와 존재할경우는 맨끝에만 작성할 수 있다.
  public static double getNum(int...nums) {
    int sum = 0;
    for( int num:nums) {
      sum += num;
    }

    return  (double) sum/nums.length;
  }

  public static void main(String[] args) {
    // 값이 여러개 => 매개변수처리 ? 값이 유동 ?
    double avg = getNum(3,20,70,50,40);
    System.out.println(avg);
    int[] numbers = { 10,24,37,41,50};
    double avg1 = getNum( numbers); // 배열을 넣으면 => 매개변수 양쪽제거 [] 안에 값만처리
    System.out.println(avg1);
  }
}
