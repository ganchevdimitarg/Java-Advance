package Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        while (lines-- > 0){
            int token = Integer.parseInt(scanner.nextLine());
            Box<Integer> text = new Box<>(token);

            System.out.println(text.toString());
        }
    }
}
