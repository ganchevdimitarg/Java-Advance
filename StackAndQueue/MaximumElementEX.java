import javafx.print.Collation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> digits = new ArrayDeque<>();

        for (int i = 0; i < numberCommands; i++) {
            int[] comment = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if (comment[0] == 1){
                digits.push(comment[1]);
            } else if (comment[0] == 2){
                 digits.pop();
            } else {
                //намира най-голямото число в стека
                int max = Collections.max(digits);
                System.out.println(max);
            }
        }
    }
}
