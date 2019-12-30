import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tokens = scanner.nextLine();
        ArrayDeque<String> printItems = new ArrayDeque<>();

        while (!tokens.equals("print")) {

            if (!tokens.equals("cancel")) {
                printItems.offer(tokens);
            } else {
                if (printItems.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printItems.pollFirst());
                }
            }
            tokens = scanner.nextLine();
        }
        while (!printItems.isEmpty()) {
            System.out.println(printItems.pollFirst());
        }
    }
}
