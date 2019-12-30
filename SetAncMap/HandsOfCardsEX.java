package SetAncMap;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCardsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, HashSet<String>> playerDecks = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"JOKER".equals(input)) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            HashSet<String> cards = Arrays.stream(tokens[1].split(", +"))
                    .collect(Collectors.toCollection(HashSet::new));

            if (!playerDecks.containsKey(name)) {
                playerDecks.put(name, cards);
            } else {
                playerDecks.get(name).addAll(cards);
            }
            input = scanner.nextLine();
        }

        for (String player : playerDecks.keySet()) {
            int deckPower = calculateDeckPower(playerDecks.get(player));
            System.out.println(player + ": " + deckPower);
        }
    }

    private static int calculateDeckPower(HashSet<String> deck) {
        int power = 0;
        for (String card : deck) {
            int currentCardPower = 0;
            switch (card.charAt(0)){
                case '2':
                    currentCardPower = 2;
                    break;
                case '3':
                    currentCardPower = 3;
                    break;
                case '4':
                    currentCardPower = 4;
                    break;
                case '5':
                    currentCardPower = 5;
                    break;
                case '6':
                    currentCardPower = 6;
                    break;
                case '7':
                    currentCardPower = 7;
                    break;
                case '8':
                    currentCardPower = 8;
                    break;
                case '9':
                    currentCardPower = 9;
                    break;
                case '1':
                    currentCardPower = 10;
                    break;
                case 'J':
                    currentCardPower = 11;
                    break;
                case 'Q':
                    currentCardPower = 12;
                    break;
                case 'K':
                    currentCardPower = 13;
                    break;
                case 'A':
                    currentCardPower = 14;
                    break;
            }
            switch (card.charAt(card.length()-1)){
                case 'S':
                    currentCardPower*=4;
                    break;
                case 'H':
                    currentCardPower*=3;
                    break;
                case 'D':
                    currentCardPower*=2;
                    break;
            }
            power += currentCardPower;

        }
        return power;
    }
}

