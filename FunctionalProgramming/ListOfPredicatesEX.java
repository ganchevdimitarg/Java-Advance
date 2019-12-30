package FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicatesEX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> arr = new ArrayList<Integer>();;
        for (int i = 0; i < n; i++) {
            arr.add(i+1);
        }

        Integer[] divisors = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Predicate<Integer> check = (i) -> {
            for (Integer a : divisors) {
                if (a == 0)
                    continue;
                if (i % a != 0)
                    return false;
            }
            return true;
        };

        for (Integer i : arr)
            if (check.test(i))
                System.out.printf("%d ", i);
    }
}
