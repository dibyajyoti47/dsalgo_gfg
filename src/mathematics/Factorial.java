package mathematics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorialRecusrive(5));
    }

    private static int getFactorialRecusrive(int n) {
        if(n == 0) return 1;
        return getFactorialRecusrive(n-1)*n;
        // t - O(n)
        // s - O(n)
    }

    public static int getFactorial(int n) {
        int res = 1;
        for (int i=n; i>=1; i--) {
            res = res*i;
        }
        return res;
        // t - O(n)
        // s - O(1)
    }

}

// t - O(n)
// s - O(1)