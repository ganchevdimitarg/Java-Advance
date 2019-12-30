import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperationsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tokens = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> digits = new ArrayDeque<>();

        //потози начин пълни стека през конзолата
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(tokens.get(0))
                .forEach(digits::push);

        for (int i = 0; i < tokens.get(1); i++) {
            digits.pop();
        }

        if (digits.isEmpty()) {
            System.out.println("0");
        } else {
            if (digits.contains(tokens.get(2))) {
                System.out.println("true");
            } else {
                int minNumber = Integer.MAX_VALUE;
                while (!digits.isEmpty()) {
                    int firstDigit = digits.pop();
                    if (minNumber > firstDigit) {
                        minNumber = firstDigit;
                    }
                }
                System.out.println(minNumber);
            }
        }
    }
}
