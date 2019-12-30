package MultidimensionalArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossfireEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];
        List<List<Integer>> matrix = new ArrayList<>();

        getDigits(matrix, rows, cols);

        String[] tokens = scanner.nextLine().split("\\s+");
        while (!tokens[0].equals("Nuke")) {

            int targetRow = Integer.parseInt(tokens[0]);
            int targetCol = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            totalScoor(targetRow, targetCol, radius, matrix, rows);

            matrix.get(targetRow).remove(targetCol - radius);
            tokens = scanner.nextLine().split("\\s+");
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    private static void getDigits(List<List<Integer>> matrix, int rows, int cols) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(count++);
            }
        }
    }

    private static void totalScoor(int coordinateRow, int coordinateCol, int radius, List<List<Integer>> matrix, int rows) {
        for (int k = 0; k < radius; k++) {
            if (coordinateRow + 1 + k < rows) {
                matrix.get(coordinateRow + 1 + k).remove(coordinateCol);
            }
            if (coordinateRow - 1 - k >= 0 && matrix.get(coordinateRow - 1 - k).size() >= coordinateRow - 1 - k) {
                matrix.get(coordinateRow - 1 - k).remove(coordinateCol);
            }
            if (coordinateCol + 1 + k < matrix.get(coordinateRow).size() && coordinateCol <= matrix.get(coordinateRow).size()) {
                matrix.get(coordinateRow).remove(coordinateCol + 1 + k);
            }
            if (coordinateCol - 1 - k >= 0)
                matrix.get(coordinateRow).remove(coordinateCol - 1 - k);
        }
    }
}