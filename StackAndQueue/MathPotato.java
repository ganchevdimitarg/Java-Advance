import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> child = new ArrayDeque<>();
        Collections.addAll(child, children);
        int count = 1;

        while (child.size() > 1) {
            for (int i = 1; i < number; i++) {
                child.offer(child.poll());
            }

            if (isPrime(count)){
                System.out.println("Prime " + child.peek());
            } else {
                System.out.println("Removed " + child.poll());
            }

            count++;
        }

        System.out.println("Last is " + child.poll());
    }

    private static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
