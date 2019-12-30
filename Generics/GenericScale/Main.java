package GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scale<Integer> n = new Scale<>(1,2);

        System.out.println(n.getHeavier());
    }
}
