import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!url.equals("Home")) {
            if (url.equals("back")) {
                if (back.size() > 1) {
                    forward.push(back.poll());
                    System.out.println(back.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (url.equals("forward")) {
                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forward.peek());
                    back.push(forward.pop());
                }
            } else {
                back.push(url);
                System.out.println(url);
                forward.clear();
            }
            url = scanner.nextLine();
        }
    }
}

