package array;

public class Ex3 {
  public static void main(String[] args) {

    // String[] str1 = new String[3];
     String str1[] = new String[3];
    str1[0] = " AA";
    str1[1] = " BB";
    str1[2] = " CC";

    String[] str2 = new String[]{" AA"," BB"," CC"};
    String[] str3 = {" AA"," BB"," CC"};

   // int[] nums = new int[3];
    int nums[] = new int[3];
    nums[0] = 11;
    nums[1] = 22;
    nums[2] = 33;
   int[] nums1 = new int[]{10,20,30};
   int[] nums2 = {10,20,30};

   double[] dobleArr = new double[]{1.1,2.2,3.3};
   double[] dobleArr1 = {1.1,2.2,3.3};

   boolean[] boolArr = new boolean[]{true, false ,false};
   boolean[] boolArr1 = {true, false ,false};

   String[] arr = {"가","나","다","라"};

    for (int i = 0; i < arr.length; i++) {
      System.out.println( arr[i]);
    }

    // 수정
    arr[0] = "수정값";
    arr[2] = "기러기";
    for (int i = 0; i < arr.length; i++) {
      System.out.println( arr[i]);
    }


  } // main end
} // class end
