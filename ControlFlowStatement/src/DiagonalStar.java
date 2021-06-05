public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int col = 0; col < number; col++) {
                    if (col == 0 || row == 0 || number - 1 == col + row || col == row || row == number - 1 || col == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
        public static void main(String[] arguments){
            printSquareStar(7);
    }
}
