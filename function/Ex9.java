package function;

public class Ex9 {

  public static int[] getNum( int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for(int num:nums){
      max = max > num ? max : num;
      min = min < num ? min : num;
    }
   // return new int[] {max,min};
    return new int[] {max,min};
  }




  //실행

  public static void main(String[] args) {
    int[] numbers = {80,54,67,89,21,50,34,74};
    // 최대값, 최소값
    int maxNum = getNum( numbers)[0];
    int minNum = getNum( numbers)[1];

    System.out.println( maxNum);
    System.out.println( minNum);
  }
}
