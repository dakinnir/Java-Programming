public class Solution {
    public static void main(String[] arguments) {
        System.out.println(addDigits(234));
    }
    public static int addDigits(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}