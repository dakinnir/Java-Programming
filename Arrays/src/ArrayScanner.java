import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(3);
        System.out.println(getAverage(arr));
        int[] sorted = sort(arr);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] intArray = new int[number];
        System.out.println("Enter " + number + " integer values.\r");
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        return intArray;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i]; }
        return (double) sum / (double) arr.length;
    }

    public static int[] sort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<newArray.length-1; i++) {
                if (newArray[i] < newArray[i+1]) {
                    swap(newArray[i+1], newArray[i]);
                    flag = true;
                }
            }
        }
        return newArray;
    }

    public static void swap(int number1, int number2) {
        int temp = number2;
        number2 = number1;
        number1 = temp;
    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int index = i+1;
            System.out.println("Number at index #" + index + ": " + arr[i]);
        }
    }
}
