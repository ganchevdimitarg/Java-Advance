package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrixLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rowsCols][rowsCols];

        for (int i = 0; i < rowsCols; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = numbers;
        }

        for (int i = 0; i < rowsCols; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < rowsCols; i++) {
            System.out.print(matrix[rowsCols - 1 - i][i] + " ");
        }
    }
}
