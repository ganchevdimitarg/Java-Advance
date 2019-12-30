package GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> n = new ArrayList<>();
        while (lines-- > 0) {

            String tokens = scanner.nextLine();

            Box<Double> text = new Box<>(Double.parseDouble(tokens));
            n.add(text);
        }

        String line = scanner.nextLine();
        Box<Double> comparatodBox = new Box<>(Double.parseDouble(line));

        System.out.println(swapTheElements(n, comparatodBox));

    }

    private static <T extends Comparable <T>> int swapTheElements(List<Box<T>> list, Box<T> box) {
        int counter = 0;
        for (Box<T> t : list) {
            if (t.compareTo(box) > 0){
                counter++;
            }
        }
        return counter;
    }
}
