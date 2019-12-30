package SetAncMap;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGameLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //добавяме в сета колекция
        LinkedHashSet<Integer> playFirstCarts = new LinkedHashSet<>(first);
        LinkedHashSet<Integer> playSecondCarts = new LinkedHashSet<>(second);

        for (int i = 0; i < 50; i++) {
            if (playFirstCarts.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (playSecondCarts.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            int firstNumber = getTopValue(playFirstCarts);
            int seconNumber = getTopValue(playSecondCarts);

            playFirstCarts.remove(firstNumber);
            playSecondCarts.remove(seconNumber);

            if (firstNumber > seconNumber) {
                playFirstCarts.add(firstNumber);
                playFirstCarts.add(seconNumber);
            } else if (seconNumber > firstNumber) {
                playSecondCarts.add(firstNumber);
                playSecondCarts.add(seconNumber);
            }
        }
        int firstPlayerDesckSize = playFirstCarts.size();
        int secondPlayerDesckSize = playSecondCarts.size();

        if (firstPlayerDesckSize > secondPlayerDesckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDesckSize > firstPlayerDesckSize) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
//        for (Integer integer : set) {
//            return integer;
//        }
//        return 0;
    }
}
