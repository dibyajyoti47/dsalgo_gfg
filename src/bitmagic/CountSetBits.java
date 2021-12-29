package bitmagic;

/*
given number 5, bits of 5 are  00---101  so result should be  2, because there are 2 bits which are set
 */

public class CountSetBits {
    public static void main(String[] args) {
        naive(5);
        naive_2 (5);
        smart(5);
    }

    public static void naive(int n) {
        int res = 0;
        while (n > 0) {
            if(n%2 != 0) res++;
            n = n/2;
        }
        System.out.println(res);
        // O(n)
    }

    // using bitwise operator
    public static void naive_2(int n){
        int res = 0;
        while (n > 0) {
            if ((n&1) == 1) res++;
            n = n >> 1;
        }
        System.out.println(res);
        //O(n)
    }

    // kerningam's algo
    public static void smart(int n) {
        int res = 0;
        while (n > 0) {
            n = n&(n-1);
            res++;
        }
        System.out.println(res);
        //O(ciyunt set bits)
    }

}
