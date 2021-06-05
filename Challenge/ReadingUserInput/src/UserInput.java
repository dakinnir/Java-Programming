import java.util.Scanner;

public class UserInput {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumber = 0;
        int number = scanner.nextInt();
        System.out.println("Enter number: ");
        boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                for (int i = 1; i <= 10; i++) {
                    number = scanner.nextInt();
                    System.out.println("Enter number #" + i + ":");
                    sumOfNumber += number;
                }
            } else {
                System.out.println("Invalid Number");
            }
            System.out.println("The total sum is: " + sumOfNumber);
            scanner.close();
     }
}