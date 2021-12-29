package bitmagic;
/*
     given an array of n numbers that has values in range [1...n+1]. Every number appears exactly once.
     Hence, one number is missing.
     {1, 4, 3} -> 2
     {1, 5, 3, 2} -> 4
     soln - (1^2^3^4^....^(n+1)) ^ (arr[0]^arr[1]^arr[2]^arr[3]^.....^arr[n-1])
 */
public class FindMissingNumber {
    public static void main(String[] args) {
//        int[] nums = {1, 5, 3, 2};
        int[] nums = {1, 4, 3};
        int res1 = 1;
        for (int i=2; i<= nums.length+1;i++){
            res1 = res1^i;
        }

        int res2 = nums[0];
        for (int i=1; i<nums.length; i++) {
            res2 = res2^nums[i];
        }

        System.out.println(res1);
        System.out.println(res2);
        int res = res1 ^ res2;
        System.out.println("missing number is : "+ res);
    }

}
