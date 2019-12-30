import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> child = new ArrayDeque<>();
        Collections.addAll(child, children);

        while (child.size() > 1) {

            for (int i = 1; i < number; i++) {
                child.offer(child.poll());
            }
            System.out.println("Removed " + child.poll());
        }


        System.out.println("Last is " + child.poll());
    }
}