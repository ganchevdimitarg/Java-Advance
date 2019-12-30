package SetAncMap;

import java.util.*;

public class CitiesContinentCountryLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continentsCountriesCities = new LinkedHashMap<>();

        while (lines-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            continentsCountriesCities.putIfAbsent(tokens[0], new LinkedHashMap<>());
            continentsCountriesCities.get(tokens[0]).putIfAbsent(tokens[1], new LinkedList<>());
            continentsCountriesCities.get(tokens[0]).get(tokens[1]).add(tokens[2]);
        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : continentsCountriesCities.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().forEach((key, value) -> System.out.println("  " + key + " -> " + value.toString()
                    .replace("[", "").replace("]", "")));
        }
    }
}
