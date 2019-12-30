package IteratorsAndComparators.ComparingObjects;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<PersonTwo> peopleByName = new TreeSet<>(new ComperatorPeopleByName());
        TreeSet<PersonTwo> peopleByAge = new TreeSet<>(new ComparatorPeopleByAge());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            PersonTwo person = new PersonTwo(tokens[0], Integer.parseInt(tokens[1]));
            peopleByName.add(person);
            peopleByAge.add(person);
        }
        for (PersonTwo personTwo : peopleByName) {
            System.out.println(personTwo.toString());
        }
        for (PersonTwo personTwo : peopleByAge) {
            System.out.println(personTwo.toString());
        }
    }
}
