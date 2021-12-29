package bitmagic;

/*
 { 4, 3, 4, 4, 4, 5, 5 } -> 3
 { 8, 7, 7, 8, 8 }  -> 8
 */

public class FindOneOddOccurring {
    public static void main(String[] args) {
        int [] nums = { 4, 3, 4, 4, 4, 5, 5 };
//        System.out.println(naive(nums));
        System.out.println(efficient(nums));
    }

    public static int naive(int [] nums) {
        for (int i=0; i< nums.length; i++) {
            int count = 0;
            for (int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count%2 != 0) {
                return nums[i];
            }
        }
        return 0;
        //O(n*n)
    }

    /*
        notes :
        x^0 = x
        x^y = y^x
        x^(y^z) = (x^y)^z
        x^x = 0
     */
    public static int efficient(int[] nums) {
        int res = 0;
        for (int i=0; i< nums.length;i++) {
//            System.out.println(res+ " ^ "+nums[i]);
            res = (res ^ nums[i]);
//            System.out.println(res);
        }
        return res;
    }

}
