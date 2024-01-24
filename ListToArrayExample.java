package task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Creating a List of strings
        List<String> List = new ArrayList<>();
        List.add("One");
        List.add("Two");
        List.add("Three");

        // Converting List into Array
        String[] stringArray = List.toArray(new String[0]);

        System.out.println("Array elements after conversion: " + Arrays.toString(stringArray));
    }
}
