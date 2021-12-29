package bitmagic;
//very importaant
public class FindTwoOddOccurring {
    public static void main(String[] args) {
        int[] nums = {3,4,3,4,5,4,4,6,7,7}; // o/p - 5,6
//        naive(nums);
        int[] arr = {3,4,3,4,8,4,4,32,7,7}; // 8, 32
        efficient(arr);
    }

    public static void naive(int[] nums) {
        for (int i=0; i<nums.length;i++) {
            int count=0;
            for(int j=0; j< nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count % 2 != 0) {
                System.out.println(nums[i]);
            }
        }
        //O(n*n)
    }

    public static void efficient(int[] arr) {
        int xor = 0;
        int res1 = 0;
        int res2 = 0;

        for (int i=0; i<arr.length; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor); //40
        int sn = xor & (~(xor-1)); //(right most set bit)
        System.out.println(sn); //8

        for (int i=0; i<arr.length; i++) {
            if((sn & arr[i]) != 0) {
                res1 = res1^arr[i];
            } else {
                res2 = res2^arr[i];
            }
        }
        System.out.println(res1 +" , "+ res2);

    }
}
