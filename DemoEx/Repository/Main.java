package DemoEx.Repository;

import DemoEx.Repository.repository.Person;
import DemoEx.Repository.repository.Repository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Repository repository = new Repository();

        Person person = new Person("Dimitar", 28, "16.03.1990");
        repository.add(person);

        Person secondPerson = new Person("Stamat", 18, "113.12.1990");
        repository.add(secondPerson);

        System.out.println(repository.get(0).toString());
        System.out.println(repository.get(1).toString());

        repository.update(1, new Person("Georgi", 55, "17.03.1963"));
        System.out.println(repository.get(1).toString());

        repository.delete(0);

        System.out.println(repository.getCount());
    }
}
