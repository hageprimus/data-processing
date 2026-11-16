package com.pluralsight.streams;

import com.pluralsight.Person;
import com.pluralsight.Helpers;

import java.util.List;

public class StreamProgram {
    //Populate list of persons
    public static void main(String[] args) {
        List<Person> myFamily = Helpers.createListOfPersons();

        String search = Helpers.getInputFromConsole("Enter the first name to search for: ");
        Helpers.closeScanner();
        List<Person> searchResults = myFamily.stream().filter(name )
    }
}
