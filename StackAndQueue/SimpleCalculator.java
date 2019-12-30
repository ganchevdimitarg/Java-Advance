import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<String> result = new ArrayDeque<>();
        Collections.addAll(result, numbers);

        while (result.size() > 1){
            int first = Integer.valueOf(result.pop());
            String op = result.pop();
            int second = Integer.valueOf(result.pop());

            switch (op){
                case "+":
                    result.push(String.valueOf(first + second));
                    break;
                case "-":
                    result.push(String.valueOf(first - second));
                    break;
            }
        }
//
//        System.out.println(result.pop());
    }
}
