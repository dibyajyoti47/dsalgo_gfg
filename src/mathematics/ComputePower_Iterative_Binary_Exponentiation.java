package mathematics;

public class ComputePower_Iterative_Binary_Exponentiation {
    public static void main(String[] args) {
        System.out.println(power(4, 5));
    }

    private static int power(int num, int power) {
        int result = 1;
        while(power > 0) {
            if(power%2 == 1) {
                result = result*num;
            }
            num = num*num;
            power = power/2;
        }
        return result;
        //O(log n)
    }


}
