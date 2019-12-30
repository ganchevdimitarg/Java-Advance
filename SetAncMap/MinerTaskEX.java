package SetAncMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTaskEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tokens = scanner.nextLine();
        LinkedHashMap<String, Long> miner = new LinkedHashMap<>();
        String resources = "";

        while (!"stop".equals(tokens)){
            if(!Character.isDigit(tokens.charAt(0))){
                resources = tokens;
                miner.putIfAbsent(resources, 0L);
            } else {
                long quantities = Long.parseLong(tokens);
                miner.put(resources, miner.get(resources) + quantities);
            }
            tokens = scanner.nextLine();
        }
        for (Map.Entry<String, Long> entry : miner.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
