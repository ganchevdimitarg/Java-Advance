package SetAncMap;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduationLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> grade = new TreeMap<>();

        for (int i = 0; i < lines; i++) {
            String name = scanner.nextLine();
            double[] gradeAndScore = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            double sum = 0d;
            for (double n : gradeAndScore) {
                sum += n;
            }
            double avgGrade = sum / gradeAndScore.length;
            grade.putIfAbsent(name, avgGrade);
        }

        for (Map.Entry<String, Double> entry : grade.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#####.###############################");
            System.out.println(entry.getKey() + " is graduated with " + decimalFormat.format(entry.getValue()));
        }
    }
}
