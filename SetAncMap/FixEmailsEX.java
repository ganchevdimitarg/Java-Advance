package SetAncMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmailsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tokens = scanner.nextLine();
        LinkedHashMap<String, String> personEmail = new LinkedHashMap<>();
        String name = "";
        int count = 0;
        while (!"stop".equals(tokens)) {
            count++;
            if (count % 2 != 0) {
                name = tokens;
                personEmail.putIfAbsent(name, "");
            } else {
                char[] email = tokens.toCharArray();
                if (email[email.length - 1] == 'g') {
                    personEmail.put(name, tokens);
                }
            }
            tokens = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : personEmail.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
