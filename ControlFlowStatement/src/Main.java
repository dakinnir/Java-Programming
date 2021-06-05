public class Main {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate /100));
    }
    public static void main(String[] args) {
        for (int i=8; i>1; i--) {
            int amount = 10000;
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(amount,i)));
        }

        System.out.println();
        System.out.println();

        System.out.println("Reversed integer: " + ReverseInteger.reverseInteger(123));
        System.out.println("Sum of first and last digit: " + SumFirstAndLast.sumFirstAndLastDigit(1242));
        System.out.println("Sum of even digit: " + EvenDigitSum.getEvenDigitSum(4346621));
        System.out.println("Number palindrome: " + NumberPalindrome.isPalindrome(231132));
        System.out.println("Shared digit: " + SharedDigit.hasSharedDigit(34,67));
        System.out.println("Similarity between last digit: " + LastDigitChecker.hasSameLastDigit(23,32, 42));
        FactorPrinter.printFactors(120);
        System.out.println();
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(LargestPrime.getLargestPrime(20));
        DiagonalStar.printSquareStar(8);
    }
}
