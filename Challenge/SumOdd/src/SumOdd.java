public class SumOdd {
    public static void main(String[] arguments) {
        int numberStart = 4;
        int end = 20;
        int count = 0;

        while (numberStart <= end) {
            numberStart++;
            if (!isEvenNumber(numberStart)) {
                continue;
            }

            count ++;
            if (count >= 5) {
                break;
            }
            System.out.println("Even number: " + numberStart);
        }
        System.out.println("Total even numbers = " + count);
    }
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int oddNumberSum = 0;
        if (end < start || (start < 0 || end < 0)) {
            return -1;
        } for (int i = start; i <= end; i++){
            if (isOdd(i)) {
                oddNumberSum += i;
            }
        } return oddNumberSum;
    }

    public static boolean isEvenNumber(int number) {
        if (number%2!=0) {
            return false;
        }
        return true;
    }

}
