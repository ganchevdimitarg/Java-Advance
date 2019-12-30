package SetAncMap;

import java.text.DecimalFormat;
import java.util.*;

public class AverageStudentsGradesLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> gradesOfStudents = new TreeMap<>();

        while (lines-- > 0) {
            String[] studens = scanner.nextLine().split("\\s+");
            String name = studens[0];
            double grade = Double.parseDouble(studens[1]);

            gradesOfStudents.putIfAbsent(name, new ArrayList<>());
            gradesOfStudents.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : gradesOfStudents.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
            double lng = entry.getValue().size();
            double sum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
//            sum = Math.round(sum * 100) / 100.0;
            System.out.printf("(avg: %.2f)%n", sum/lng);
        }
    }
}
