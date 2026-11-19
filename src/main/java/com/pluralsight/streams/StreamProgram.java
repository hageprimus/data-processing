package com.pluralsight.streams;

import com.pluralsight.Person;
import com.pluralsight.Helpers;

import java.util.Comparator;
import java.util.List;

public class StreamProgram {
    //Populate list of persons
    public static void main(String[] args) {
        List<Person> myFamily = Helpers.createListOfPersons();

        String search = Helpers.getInputFromConsole("Enter the first name to search for: ");
        Helpers.closeScanner();
        myFamily.stream().filter(p -> p.getFirstName().equalsIgnoreCase(search)).forEach(System.out::println);

        int sum = myFamily.stream().reduce(0, (temp, p) -> temp + p.getAge(), Integer::sum);
        double avg = sum / myFamily.size();
        System.out.println("AVERAGE AGE: " + avg);

        Person lowest = myFamily.stream().sorted(Comparator.comparing(Person::getAge)).toList().get(0);
        System.out.println("LOWEST AGE: " + lowest);
        Person highest = myFamily.stream().sorted(Comparator.comparing(Person::getAge).reversed()).toList().get(0);
        System.out.println("HIGHEST AGE: " + highest);
    }
}
