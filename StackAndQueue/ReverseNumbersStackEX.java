import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStackEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numberFinal = new ArrayDeque<>();

        for (int number : numbers) {
            numberFinal.push(number);
        }

        for (Integer integer : numberFinal) {
            System.out.println(integer);
        }
    }
}
