package mathematics;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor_EuclideanEfficient(9, 10));
    }
    private static int getGreatestCommonDivisor_Naive(int a, int b) {
        int hcf = Math.min(a,b);
        while(hcf > 0 ) {
            if ((a % hcf == 0) && (b % hcf == 0)) {
                break;
            }
            hcf--;
        }
        return hcf;
        // O( min(n) )
    }


    // Euclidean algorithm
    private static int getGreatestCommonDivisor_Euclidean (int a, int b) {
        while( a != b ) {
            if(a > b) {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        return a;
        // O (log n ) (to the base a-b)
    }

    // Euclidean algorithm efficient
    private static int getGreatestCommonDivisor_EuclideanEfficient (int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGreatestCommonDivisor_EuclideanEfficient(b, (a%b));
        // O (log n ) (to the base a-b)
    }
}
