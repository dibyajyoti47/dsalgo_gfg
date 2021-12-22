package mathematics;

import static mathematics.CheckPrime.*;


public class PrimeFactors {
    public static void main(String[] args) {
        printPrimeFactors_naive(12);
    }

    private static void printPrimeFactors_naive(int num) {
        for (int i=2; i<num; i++) {
            if(checkPrime_Efficient(i)) {
                int x = i;
                while(num % x == 0) {
                    System.out.print(i+ " , ");
                    x *= i ;
                }

            }

        }
    }
}
