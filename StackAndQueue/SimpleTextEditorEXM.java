import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditorEXM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfCommands = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        Deque<StringBuilder> stack = new ArrayDeque<>();

        while (numbersOfCommands-- > 0) {
            String[] comandsAndArguments = scanner.nextLine().split("\\s+");

            switch (comandsAndArguments[0]) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
            }
        }
    }
}
