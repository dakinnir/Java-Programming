import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] arguments) {
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        char[] mf = mostFamous.toCharArray();
        for (int i = 0; i < mf.length; i++) {
            if (mf[i] == ' ') {
                mf[i] = '-';
            }
        }
        System.out.println(mf);
        System.out.println();

        // Arrays of strings
        String[] names = {"Peter", "Patricia", "Hunter", "Abigail", "Zoey", "Sean", "Robert", "Hunter", "Sarah", "Gabe", "Gina", "Roy", "Paschal"};
        System.out.println("The original order: ");

        for (int i=0; i<names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }

        System.out.println();
        Arrays.sort(names);
        System.out.println("The new order: ");
        for (int i=0; i<names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }



    }

}
