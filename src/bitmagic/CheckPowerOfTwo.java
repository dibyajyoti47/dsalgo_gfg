package bitmagic;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        naive(16);
        efficient(16);

    }
    public static void naive(int n) {
        boolean flag =true;
        if (n == 0) flag = false;

        while(n != 1) {
            if (n % 2 != 0) {
                flag = false;
                break;
            }
            n = n/2;
        }
        System.out.println(flag);
        //O(log n)
    }

    //brian kerningam algo
    //all the numbers which is a power to 2, their bit has only one 1 bit set. e.g 2 - 10,  4 - 100, 8 - 1000
    public static void efficient(int n) {
        boolean flag =true;
        if ((n == 0) || (n == 1)) {
            flag = false;
            System.out.println(flag);
            return;
        }
        flag = (n & (n-1))  == 0;
        System.out.println(flag);
    }
}
