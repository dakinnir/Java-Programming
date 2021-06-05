import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                // assigning the max and min with the first input user enters
                if (first) min=number; max=number; first = false;
                if (number < min) min = number;
                if (number > max) max = number;
            } else {
                System.out.println("Min: " + min + ", Max: " + max);
                break;
            }
        }
        scanner.close();
    }
}
