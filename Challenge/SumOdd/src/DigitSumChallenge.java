public class DigitSumChallenge {
    public static void main(String[]arguments) {
        System.out.println(sumDigits(1277));
        System.out.println(reverseDigits(123) + "\n");
    }
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            // extract least significant digits
            int digit = number % 10;
            sum += digit;
            // least sigificant digits
            number /= 10;
        }
        return sum;
    }
    public static int reverseDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum, reverse = 0;
        while (number > 0) {
            // extract least significant digits
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}
