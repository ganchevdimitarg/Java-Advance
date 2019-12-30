import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();

        while(!line.equals("Home")){

            if (line.equals("back")){
                if (history.size() > 1){
                    history.pop();
                    System.out.println(history.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                history.push(line);
                System.out.println(history.peek());
            }

            line = scanner.nextLine();
        }
    }
}




//        while(!line.equals("Home")){
//
//                if (line.equals("back")){
//                if (back.size() > 1){
//                forward.push(back.pop());
//                System.out.println(back.peek());
//                } else {
//                System.out.println("no next URLs");
//                }
//                } else if (line.equals("forward")) {
//                if (!forward.isEmpty()){
//
//                }
//                } else {
//                back.push(line);
//                if (!forward.isEmpty()){
//                forward.clear();
//                }
//
//                System.out.println(back.peek());
//                }
//
//                line = scanner.nextLine();
//                }
