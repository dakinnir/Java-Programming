public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNum = number;
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return (reverse == originalNum);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(205));
        System.out.println(205%10);
    }
}

