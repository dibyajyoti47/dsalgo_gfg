package bitmagic;

public class Demo3 {
    public static void main(String[] args) {
        /*
        signed right shift operator - >>
        opposite of left shift
        Note: it treats positive numbers and negative numbers differently
                in case of negative numbers it fills leading bits with 1 and in case of positives it fills leading bits-
                with zeros to keep the sign
        */
        System.out.println(33 >> 1);
        System.out.println(-2 >> 2);

        /*
        unsigned right operator  -   >>>
        this also does the same, but....
        it fills leading bits with zero. it doesn't care about the signs
         */
        System.out.println(-2 >>> 2);


    }
}
