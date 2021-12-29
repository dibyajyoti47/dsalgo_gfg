package bitmagic;
/*
input =  "abc",  o/p -> {"","a","b","c","ab","ac","bc","abc"}
i/p = "ab", o/p ->  {"","a","b","ab"}
note - length of string = n. so o/p should be 2 to the power n
 */


public class GeneratingPowerSet {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        int pow = (int)Math.pow(2,n);
        System.out.println(pow);
        for(int counter=0; counter<pow;counter++) {
            for (int j=0; j<n;j++) {
                if((counter & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
