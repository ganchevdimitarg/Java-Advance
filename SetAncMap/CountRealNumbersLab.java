package SetAncMap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbersLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> repeatedNumber = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            repeatedNumber.putIfAbsent(numbers[i], 0);
            repeatedNumber.put(numbers[i], repeatedNumber.get(numbers[i]) + 1);
        }

        for (Map.Entry<Double, Integer> number : repeatedNumber.entrySet()) {
            System.out.printf("%.1f -> %d%n", number.getKey(), number.getValue());
        }
    }
}
