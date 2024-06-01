package function;

public class Ex8 {



  public static double getAvg(int[] nums) {
     double sum = 0.0;
     for(int num:nums){
       sum += num;
     }
     return sum/ nums.length;
  }

  //실행

  public static void main(String[] args) {
    double avg = getAvg(new int[]{10,20,50,40});
    System.out.println( "평균 : " + avg);
  }
}
