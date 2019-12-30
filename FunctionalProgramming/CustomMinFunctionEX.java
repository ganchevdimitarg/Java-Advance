package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunctionEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> smallestNumber = x -> {
            int min = Integer.MAX_VALUE;
            for (Integer integer : x) {
                if (min > integer){
                    min = integer;
                }
            }
            return min;
        };
        System.out.println(smallestNumber.apply(n));
    }
}
