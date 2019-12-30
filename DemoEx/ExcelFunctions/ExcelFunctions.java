package DemoEx.ExcelFunctions;

import java.util.*;

public class ExcelFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String[][] table = new String[lines][];
        for (int i = 0; i < lines; i++) {
            table[i] = scanner.nextLine().split("([, ]+)");
        }

        String[] commad = scanner.nextLine().split("\\s+");

        switch (commad[0]) {
            case "hide":
                hideColumnAndPrint(table, commad[1]);
                break;
            case "sort":
                sortByColumn(table, commad[1]);
                break;
            default:
                filterByColumnAndPrint(table, commad[1], commad[2]);
                break;
        }

    }

    private static void filterByColumnAndPrint(String[][] table, String key, String value) {
        int indexFilter = getIndex(table[0], key);

        System.out.println(String.join(" | ", table[0]));
        for (int i = 1; i < table.length; i++) {
            if (table[i][indexFilter].equals(value)){
                System.out.println(String.join(" | ", table[i]));
            }
        }
    }

    private static void sortByColumn(String[][] table, String s) {
        int indexSort = getIndex(table[0], s);

        for (int j = 0; j < table.length; j++) {
            for (int i = 1; i < table.length - 1 - j; i++) {
                if (table[i][indexSort].compareTo(table[i + 1][indexSort]) > 0) {
                    String[] tmp = table[i];
                    table[i] = table[i + 1];
                    table[i + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
                if (j != table[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    private static void hideColumnAndPrint(String[][] table, String s) {
        int index = getIndex(table[0], s);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (j == index) {
                    continue;
                }
                System.out.print(table[i][j]);
                if (j != table[i].length - 1) {
                    if (!(j == table[i].length - 2 && index == j + 1)) {
                        System.out.print(" | ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static int getIndex(String[] strings, String s) {
        int index = -1;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(s)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
