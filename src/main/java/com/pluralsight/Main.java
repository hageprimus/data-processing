package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Populate list of persons
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

        //Variables for list search
        Scanner s = new Scanner(System.in);
        String search = getInputFromConsole("Enter the first name to search for: ", s);
        s.close();
        List<Person> searchResults = new ArrayList<>();

        //Variables for age data
        int lowest = Integer.MAX_VALUE;
        Person lowestAge = myFamily.get(0);
        int highest = 0;
        Person highestAge = myFamily.get(0);
        int sum = 0;

        //Iterate through original list
        for (Person p : myFamily) {
            if (p.getFirstName().equalsIgnoreCase(search)) {
                searchResults.add(p);
            }
            if (p.getAge() < lowest) {
                lowest = p.getAge();
                lowestAge = p;
            }
            if (p.getAge() > highest) {
                highest = p.getAge();
                highestAge = p;
            }
            sum += p.getAge();
        }

        //Print age data
        double avg = sum / myFamily.size();
        System.out.println("LOWEST AGE: " + lowestAge);
        System.out.println("HIGHEST AGE: " + highestAge);
        System.out.println("AVERAGE AGE: " + avg);

        //Print search results
        System.out.println("SEARCH RESULTS:");
        for (Person p : searchResults) {
            System.out.println(p);
        }

    }

    private static String getInputFromConsole(String display, Scanner s) {
        System.out.println(display);
        return s.nextLine().trim();
    }

}
