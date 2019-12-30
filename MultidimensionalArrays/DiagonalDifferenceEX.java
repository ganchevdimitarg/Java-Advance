package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifferenceEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rowsCols][rowsCols];

        for (int i = 0; i < rowsCols; i++)  {
            int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            for (int k = 0; k < rowsCols; k++) {
                for (int j = 0; j < rowsCols; j++) {
                    matrix[i][j] = tokens[j];
                }
            }
        }

        int firstSumDiagoal = 0;
        int secondSumDiagoal = 0;
        for (int i = 0; i < rowsCols; i++) {
            firstSumDiagoal += matrix[i][i];
            secondSumDiagoal += matrix[i][rowsCols - 1 - i];
        }
        System.out.println(Math.abs(firstSumDiagoal - secondSumDiagoal));
    }
}

