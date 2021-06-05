import java.util.Scanner;

public class MinimumElementChallenge {
    public static Scanner sc = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter the numbers: ");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt(); }
        return array;
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount of numbers you want in the array: ");
        int count = sc.nextInt();

        int[] newArray = readIntegers(count);
        System.out.println("Minimum: " + findMinimum(newArray));
    }
}
