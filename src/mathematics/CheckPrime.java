package mathematics;

import java.util.Date;

public class CheckPrime {
    public static void main(String[] args) {
//        System.out.println(checkPrime_naive(1031));
        System.out.println(checkPrime_Efficient(4));
//        System.out.println(checkPrime_MoreEfficient(1031));

    }

    public static boolean  checkPrime_naive(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
        // O(n)
    }
    public static boolean checkPrime_Efficient(int num) {
        if (num == 1) return false;
        for (int i=2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
        // O(square root of n)
    }
    public static boolean checkPrime_MoreEfficient(int num) {
        if (num == 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i=5; i*i < num; i=i+6) {
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
        // O(square root of n)
    }
}
