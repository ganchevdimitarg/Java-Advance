import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesesEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> steck = new ArrayDeque<>();
        boolean answer = true;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                steck.push(current);
            } else {
                if (steck.isEmpty()) {
                    answer = false;
                    break;
                }
                char openig = steck.pop();
                if ((openig != '(' && current == ')') ||
                        (openig != '[' && current == ']') ||
                        (openig != '{' && current == '}')) {
                    answer = false;
                    break;
                }
            }
        }
        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



