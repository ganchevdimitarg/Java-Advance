import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class RoboticsEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roboData = scanner.nextLine().split(";");
        String[] robots = new String[roboData.length];
        int[] workingTime = new int[roboData.length];
        int[] processTime = new int[roboData.length];

        for (int i = 0; i < roboData.length; i++) {
            //взема целия текст, сплитваго по - и взема 0 елемент
            robots[i] = roboData[i].split("-")[0];
            workingTime[i] = Integer.parseInt(roboData[i].split("-")[1]);
        }

        String[] timeData = scanner.nextLine().split(":");

        int hours = Integer.parseInt(timeData[0]);
        int minuts = Integer.parseInt(timeData[1]);
        int seconts = Integer.parseInt(timeData[2]);

        int startTime = hours * 3600 + minuts * 60 + seconts;

        int time = 0;

        Deque<String> products = new ArrayDeque<>();

        String currentProduc = scanner.nextLine();

        while (!currentProduc.equals("End")) {
            products.offer(currentProduc);
            currentProduc = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            time++;

            String product = products.pollFirst();

            boolean isAssugned = false;
            for (int i = 0; i < robots.length; i++) {
                if (processTime[i] == 0 && !isAssugned) {
                    processTime[i] = workingTime[i];
                    printTask(robots[i], startTime + time, product);
                    isAssugned = true;
                }
                if (processTime[i] > 0) {
                    processTime[i]--;
                }
            }
            if (!isAssugned) {
                products.offer(product);
            }
        }
    }

    private static void printTask(String robot, int time, String product) {
        int hours = (time / 3600) % 24;
        int munits = time % 3600 / 60;
        int seconds = time % 60;

        System.out.println(String.format("%s - %s [%02d:%02d:%02d]", robot, product,
                hours, munits, seconds));
    }
}
