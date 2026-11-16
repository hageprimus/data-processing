package com.pluralsight.loops;

import com.pluralsight.Person;
import com.pluralsight.Helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopProgram {
    public static void main(String[] args) {
        //Populate list of persons
        List<Person> myFamily = Helpers.createListOfPersons();

        //Variables for list search
        String search = Helpers.getInputFromConsole("Enter the first name to search for: ");
        Helpers.closeScanner();
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
}
