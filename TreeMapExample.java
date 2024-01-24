package task12;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> name = new TreeMap<>();

        name.put(101, "Arun");
        name.put(102, "Boss");
        name.put(103, "Chan");

        System.out.println("Names of employees in alphabetical order:");

        for (String names : name.values()) {
            System.out.println(names);
        }
    }
}
