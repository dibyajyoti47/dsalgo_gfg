package mathematics;

import static mathematics.CheckPrime.*;


public class PrimeFactors {
    public static void main(String[] args) {
//        printPrimeFactors_naive(900);
        printPrimeFactors_eff(143);
    }

    private static void printPrimeFactors_naive(int num) {
        if (num<=1) return;
        for (int i=2; i<num; i++) {
            if(checkPrime_Efficient(i)) {
                int x = i;
                while(num % x == 0) {
                    System.out.print(i+ " , ");
                    x *= i ;
                }
            }
        }
        // O(n*n log n)
    }
    private static void printPrimeFactors_eff(int num) {
        if (num<=1) return;
        for (int i=2; i*i<=num; i++) {
            while (num % i == 0) {
                System.out.print(i + " , ");
                num = num/i;
            }
        }
        if(num > 1) System.out.print(num);
    }
}
