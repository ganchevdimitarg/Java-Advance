package SetAncMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbolsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        TreeMap<Character, Integer> characters = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            characters.putIfAbsent(letter, 0);
            characters.put(letter, characters.get(letter) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
