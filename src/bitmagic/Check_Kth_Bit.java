package bitmagic;

public class Check_Kth_Bit {

    public static void main(String[] args) {
        kthBit(5, 3);
        kthBit_better(5, 3);
    }

    //checks kth bit is set or not
    public static void kthBit(int n, int k) {
        int res = n & (1 << (k-1));
        if ( res != 0) System.out.println("Yes");
        else System.out.println("No");
    }

    //easy and better
    public static void kthBit_better(int n, int k) {
        int res = 1 & (n >> (k-1));
        if ( res == 1) System.out.println("Yes");
        else System.out.println("No");
    }


}
