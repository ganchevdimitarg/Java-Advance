package IteratorsAndComparators.ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> data = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .skip(1).collect(Collectors.toCollection(ArrayList::new));

        ListyIterator listyIterator = new ListyIterator(data);


        String line = scanner.nextLine();

        while (!"END".equals(line)) {

            switch (line){
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        System.out.println(listyIterator.getInternalItem());
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String s : listyIterator) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;
            }

            line = scanner.nextLine();
        }

    }
}
