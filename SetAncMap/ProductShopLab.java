package SetAncMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShopLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = scanner.nextLine().split(", ");
        TreeMap<String, LinkedHashMap<String, Double>> producsInTheShop = new TreeMap<>();

        while (!"Revision".equals(lines[0])){
            String shop = lines[0];
            String product = lines[1];
            double price = Double.parseDouble(lines[2]);
            producsInTheShop.putIfAbsent(shop, new LinkedHashMap<>());
            producsInTheShop.get(shop).putIfAbsent(product, price);
            lines = scanner.nextLine().split(", ");
        }
        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : producsInTheShop.entrySet()) {
            System.out.println(entry.getKey()+"->");
            entry.getValue().forEach((key, value) -> {
                System.out.printf("Product: %s, Price: %.1f%n", key, value);
            });
        }
    }
}
