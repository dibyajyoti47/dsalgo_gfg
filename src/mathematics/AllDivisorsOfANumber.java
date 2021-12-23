package mathematics;

public class AllDivisorsOfANumber {

    public static void main(String[] args) {
//        printAllDivisors_naive(15);
//        printAllDivisors_efficient(25);
        printAllDivisors_efficient_sorted(15);
    }

    public static void printAllDivisors_naive(int n) {
        for (int i=1;i<=n;i++) {
            if(n % i == 0) {
                System.out.print(i + " , ");
            }
        }
        //O(n)
    }
    public static void printAllDivisors_efficient(int num) {
        for (int i=1; i*i < num; i++) {
            if(num % i == 0) {
                System.out.print(i + " - ");
                if(i != num/i) {
                    System.out.print(num/i+ " - ");
                }
            }
        }
        // O (sqrt of n)
    }
    public static void printAllDivisors_efficient_sorted (int num) {
        int i;
        for (i=1; i*i < num; i++) {
            if(num % i == 0) {
                System.out.print(i + " - ");
            }
        }
        for(; i>=1;i--) {
            if(num % i == 0) {
                System.out.print(num/i + " - ");
            }
        }
    }
}
