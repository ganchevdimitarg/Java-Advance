package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElementEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> n = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestDigit = x -> {
            int min = Integer.MAX_VALUE;
            int index = 0;
            List<Integer> equals = new ArrayList<>();
            for (int i = 0; i < x.size(); i++) {
                if (min > x.get(i)) {
                    min = x.get(i);
                    index = i;
                } else if (min == x.get(i)){
                    equals.add(i);
                }
            }
            if (equals.size() != 0){
               return equals.get(equals.size() - 1);
            }
            return index;
        };

        System.out.println(smallestDigit.apply(n));
    }
}