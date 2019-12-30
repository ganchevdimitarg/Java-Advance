package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppliedArithmeticsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();
        while (!"end".equals(cmd)) {

            switch (cmd) {
                case "add":
                    numbers = numbers.stream().map(x -> x + 1).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(x -> x - 1).collect(Collectors.toList());
                    break;
                default:
                    numbers.forEach(e -> System.out.print(e + " "));
                    System.out.println();
            }

            cmd = scanner.nextLine();
        }
    }
}
