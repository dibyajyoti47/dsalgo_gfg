package mathematics;

public class ComputingPower {
    public static void main(String[] args) {
//        System.out.print(computePower_naive(3, 4));
        System.out.println(computePower_efficient_recursive(3,4));
    }

    private static int computePower_efficient_recursive(int number, int power) {
        if(power == 0) return 1;
        int temp = computePower_efficient_recursive(number, power/2);
        temp = temp*temp;
        if (power%2 == 0) {
            return temp;
        }else {
            return temp*number;
        }
        // O(log n) --
    }

    private static int computePower_naive(int number, int power) {
        int result = 1;
        for (int i=1; i<=power;i++) {
            result *= number;
        }
        return result;
        //O(n)
    }
}