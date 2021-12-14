package mathematics;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println(getLCM_Euclidean(15,9));
    }

    public static int getLCM_Naive(int a, int b) {
        int lcm = Math.max(a,b);
        while(true) {
            if (lcm % a == 0 &&  lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
        // O(a*b - max(a,b)
    }

    public static int getLCM_Euclidean(int a, int b) {
        return (a*b) / getHCF(a, b);
    }
    private static int getHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getHCF(b, (a%b));
    }
}
