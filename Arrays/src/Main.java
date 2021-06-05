public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[3]);
//
//        int[] myArray = {1,2,3,4,5,6,7,8,9};
//        System.out.println(myArray[3]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}