package SetAncMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split("-+");
        HashMap<String, String> phonebook = new HashMap<>();

        while (!"search".equals(token[0])) {
            phonebook.putIfAbsent(token[0], token[1]);
            phonebook.put(token[0], token[1]);
            token = scanner.nextLine().split("-+");
        }
        String searchName = scanner.nextLine();
        while (!"stop".equals(searchName)) {
            if (phonebook.containsKey(searchName)) {
                for (String name : phonebook.keySet()) {
                    if (name.equals(searchName)){
                        System.out.println(name + " -> " + phonebook.get(searchName));
                    }
                }
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }
    }
}
