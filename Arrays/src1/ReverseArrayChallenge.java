import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i=0; i<=halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
    public static void main(String[] args) {
        // Array Literal
        int[] array = new int[]{1,4,5,6,7,9,2};
        System.out.println("Original: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed: " + Arrays.toString(array));

    }

}
