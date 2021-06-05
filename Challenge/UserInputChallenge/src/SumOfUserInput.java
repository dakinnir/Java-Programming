import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumber = 0;
        int count = 1;
        while (count<=10) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sumOfNumber += number;
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("The total sum is: " + sumOfNumber);
        scanner.close();

    }
}
