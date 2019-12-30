package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrintEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] words = scanner.nextLine().split("\\s+");
        Consumer<String> worsPrinter = System.out::println;
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(worsPrinter);


//        for (String word : words) {
//            worsPrinter.accept(word);
//        }

    }
}
