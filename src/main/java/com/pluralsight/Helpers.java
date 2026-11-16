package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helpers {
    private static final Scanner s = new Scanner(System.in);

    public static List<Person> createListOfPersons() {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Ezra", "Auston", 60));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Auston", 17));
        myFamily.add(new Person("Hage", "Primus", 27));
        myFamily.add(new Person("John", "Doe", 40));
        myFamily.add(new Person("Mary", "Smith", 23));
        return myFamily;
    }

    public static String getInputFromConsole(String display) {
        System.out.println(display);
        return s.nextLine().trim();
    }

    public static void closeScanner() {
        s.close();
    }
}
