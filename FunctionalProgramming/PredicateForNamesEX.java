package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class PredicateForNamesEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int legth = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");


        Arrays.stream(names).filter(e -> e.length() <= legth).forEach(System.out::println);
    }
}
