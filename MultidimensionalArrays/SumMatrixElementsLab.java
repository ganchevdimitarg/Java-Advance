//package MultidimensionalArrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SumMatrixElementsLab {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] rowscols = scanner.nextLine().split(", ");
//        int rows = Integer.parseInt(rowscols[0]);
//        int cols = Integer.parseInt(rowscols[1]);
//        int[][] matrix = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
//            matrix[i] = numbers;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        System.out.printf("%d%n%d%n%d%n", rows, cols, sum);
//    }
//}
