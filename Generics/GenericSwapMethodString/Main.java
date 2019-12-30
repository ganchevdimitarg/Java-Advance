package Generics.GenericSwapMethodString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Swap> n = new ArrayList<>();
        while (lines-- > 0) {

            String tokens = scanner.nextLine();

            Swap text;
            try {
                int numbers = Integer.parseInt(tokens);
                text = new Swap<>(numbers);
                n.add(text);
            } catch (Exception e) {
                text = new Swap<>(tokens);
                n.add(text);
            }

        }

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        swapTheElements(command, n);
        for (Swap swap : n) {
            System.out.println(swap.toString());
        }
    }

    private static void swapTheElements(int[] command, List<Swap> n) {
        Swap current = n.get(command[0]);
        n.set(command[0], n.get(command[1]));
        n.set(command[1], current);

    }


}
