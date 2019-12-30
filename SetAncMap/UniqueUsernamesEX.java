package SetAncMap;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernamesEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> names = new LinkedHashSet<>();

        while (lines-- > 0){
            String name = scanner.nextLine();
            names.add(name);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
