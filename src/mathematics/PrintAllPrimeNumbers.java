package mathematics;

import java.util.Arrays;
import static mathematics.CheckPrime.*;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
//        printAllPrimeisPrime_naive(9);
        printAllPrimeNumbers_efficient(9);
    }
    public static void printAllPrimeisPrime_naive (int num){
        for (int i=2; i<=num; i++) {
            if(checkPrime_Efficient(i)) System.out.print(i + " , ");
        }
        // O(n * n)
    }

    //Sieve of Eratosthenes
    public static void printAllPrimeNumbers_efficient (int num){
        boolean [] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);

        for(int i=2; i*i<=num; i++){
            if (isPrime[i]) {
               for(int j=i*2; j<=num; j=j+i) {
                   isPrime[j] = false;
               }
            }
        }

        for(int i=2; i<=num; i++) {
            if(isPrime[i]) System.out.print(i+" , ");
        }

        //O(log log n)
    }

    //Sieve of Eratosthenes sorter, but same time complexity
    public static void printAllPrimeNumbers_efficient_optimized (int num){
        boolean [] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);

        for (int i=2; i<=num; i++) {
            System.out.print(isPrime[i]);
            if(isPrime[i]) {
                for (int j=i*i; j<=num; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        //O(log log n)
    }

}
