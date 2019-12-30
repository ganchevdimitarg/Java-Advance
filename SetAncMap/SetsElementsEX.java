package SetAncMap;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsElementsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] token = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < token[0] + token[1]; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < token[0]) {
                firstSet.add(number);
                continue;
            }
                secondSet.add(number);
        }

        for (Integer first : firstSet) {
            for (Integer second : secondSet) {
                if (first.equals(second)) {
                    System.out.print(first + " ");
                }
            }
        }
    }
}
