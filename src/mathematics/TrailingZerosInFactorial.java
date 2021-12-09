package mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
//        System.out.println(getTrailingZeros_bruteforce(15));
        System.out.println(getTrailingZeros_efficient(15));
    }

    static int getTrailingZeros_bruteforce(int n) {
        int factorial = 1;
        for (int i=n; i>=1; i--) {
            factorial *= i;
        }
        int result = 0;
        System.out.println(factorial);
        while (factorial % 10 == 0) {
            result++;
            factorial /= 10;
        }
        return result;
        // O(n)
    }

    static int getTrailingZeros_efficient(int n) {
        int result = 0;

        for (int i=5; i<=n; i=i*5) {
            result = result + n/i;
        }
        return result;
        //O(log n)
    }
}
