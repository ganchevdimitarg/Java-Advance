package IteratorsAndComparators.StackIterator;


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tokens = scanner.nextLine();

            Stack stack = new Stack();
        while (!tokens.equalsIgnoreCase("END")) {

            String commnad = tokens.substring(0, 3);
            switch (commnad) {
                case "Pus":
                    List<Integer> number = Arrays.stream(tokens.substring(5).split("[, ]+")).map(Integer::parseInt).collect(Collectors.toList());
                    stack.push(number);
                    break;
                case "Pop":
                    if (stack.size() == 0){
                        System.out.println("No elements");
                        break;
                    }
                    stack.pop();
                    break;
            }

            tokens = scanner.nextLine();

        }

        stack.forEach(System.out::println);
        stack.forEach(System.out::println);

    }
}
