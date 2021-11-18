package mathematics;

public class PalindromNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(checkPalindrom(num));
    }

    public static boolean checkPalindrom(int n) {
        int nCopy = n;
        int newNum = 0;
        while(n > 0) {
            newNum = (newNum * 10) + n%10;
            n /= 10;
        }
        return newNum == nCopy;
    }

}
