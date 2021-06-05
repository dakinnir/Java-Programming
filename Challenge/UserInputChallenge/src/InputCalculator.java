import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
        }
        average = Math.round((double)sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
