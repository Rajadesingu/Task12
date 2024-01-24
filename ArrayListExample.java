package task12;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating  ArrayList 
        ArrayList<String> arr = new ArrayList<>();

        // Adding elements to the ArrayList
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Orange");

        // original ArrayList
        System.out.println("Original ArrayList: " + arr);

        // Removing all elements from the ArrayList
        arr.clear();

        // Displaying the ArrayList after removing all elements
        System.out.println("ArrayList after removing all elements: " + arr);
    }
}
