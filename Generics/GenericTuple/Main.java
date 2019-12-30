package Generics.GenericTuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] secondLine = scanner.nextLine().split("\\s+");
        String[] thirdLine = scanner.nextLine().split("\\s+");

        Tuple<String, String> one = new Tuple<>(firstLine.substring(0, firstLine.lastIndexOf(" ")).trim(),
                firstLine.substring(firstLine.lastIndexOf(" ") + 1));

        Tuple<String, Integer> two = new Tuple<>(secondLine[0], Integer.parseInt(secondLine[1]));

        Tuple<Integer, Double> three = new Tuple<>(Integer.parseInt(thirdLine[0]), Double.parseDouble(thirdLine[1]));

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
