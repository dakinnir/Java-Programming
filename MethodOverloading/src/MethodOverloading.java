public class MethodOverloading {
    public static void main(String[] arguments) {
        // calling of our method
        calcFeetAndInchesToCentimeters(0, 12);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // conditional statement to signal when given an invalid parameter
        if (feet < 0 && inches < 0 && inches > 12) {
            System.out.println("Invalid parameters");
            return -1;
        }
        double centimeters = Math.round((feet * 30.48) + (inches * 2.54));
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    // second method overloading
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters");
            return -1;
        }
        // conversion to feet
        double feet = (int)inches / 12;
        // the remaining after the feet has been calculated
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

