package SetAncMap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTableEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        TreeSet<String> tableOfElements = new TreeSet<>();

        while (lines-- > 0){
            String[] elements = scanner.nextLine().split("\\s+");
            tableOfElements.addAll(Arrays.asList(elements));
        }

        for (String element : tableOfElements) {
            System.out.print(element + " ");
        }
    }
}
