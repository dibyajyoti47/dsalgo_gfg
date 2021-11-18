package mathematics;

public class CountDigits {
    public static void main(String[] args) {
        int num = 5436;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {
        int count = 0;
        while(num > 0) {
            num = num/10;
            count++;
        }
        return count;
    }
}

// O(n)