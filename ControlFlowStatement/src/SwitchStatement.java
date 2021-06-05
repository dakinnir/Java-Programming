public class SwitchStatement {
    public static void main(String[]arguments) {
        // code here
        char letter = 'F';
        switch (letter) {
            case 'C': case 'D': case 'E':
                System.out.println(letter + " was found!");
                break;
            case 'B': case 'A':
                System.out.println(letter + " was found!");
                break;
            default:
                System.out.println("Letter was not found!");
        }
        printDayOfTheWeek(-6);
        printDaysOfTheWeek(23);
        printNumberInWord(3);
    }
    public static void printDayOfTheWeek(int day) {
         switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
             default:
                 System.out.println("Invalid parameters!");
                 break;
        }

    }

    // DayOfTheWeekChallenge w/ if-else statement
    // method name is different from top
    public static void printDaysOfTheWeek(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid parameter!");
        }
    }
    public static void printNumberInWord(int number) {
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }



}
