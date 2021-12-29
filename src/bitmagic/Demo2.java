package bitmagic;

public class Demo2 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(~x); //bitwise not , it basically invert all the bits
        //formula - 2 P31 -1 -x  eg 2p31 -1 -5  ->  -6

        /*
        The left-shift operator causes the bits in shift-expression to be shifted to the left by the number of positions specified by additive-expression
        */
        x = 4;
        System.out.println(x << 1); //8    //one trailing zeros will added at the right end. beginning 1 bit will be ignored
        System.out.println(x << 3); //32   //three trailing zeros will be added at the right end, beginning 3 bits will be ignored
        System.out.println(3 << 30); //-1073741824     //30 trailing zeros will be added at the right end, beginning 30 bits will be ignored
        x= -1;
        System.out.println(x << 1);
    }
}
