//package DemoEx.ExcelFunctions;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class ExcelFunctionsSecond {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int lines = Integer.parseInt(scanner.nextLine());
//        int n = lines;
//        int index = 0;
//        List<List<String>> table = new ArrayList<>();
//        List<String> header = new ArrayList<>();
//
//        while (lines > 0) {
//
//            List<String> tokens = Arrays.stream(scanner.nextLine().split("([, ]+)")).collect(Collectors.toList());
//            if (lines == n) {
//                header.addAll(tokens);
//            } else {
//                table.add(index++, tokens);
//            }
//            lines--;
//        }
//
//        String[] command = scanner.nextLine().split("\\s+");
//
//        switch (command[0]) {
//            case "sort":
//                index = getIndex(index, header, command[1]);
//                int sortIndex = index;
//                if (isHaveSortIndex(header, command[1])) {
//                    System.out.println(getElementsOfList(header));
//                    table.sort(Comparator.comparing(e -> e.get(sortIndex)));
//                    printElementsOfTable(table);
//                }
//                break;
//            case "filter":
//
//                System.out.println(getElementsOfList(header));
//                index = getIndex(index, header, command[1]);
//                int filterIndex = index;
//                for (List<String> list : table) {
//                    for (int i = 0; i < list.size(); i++) {
//                        if ((list.get(filterIndex).equals(list.get(i)) &&
//                                (list.get(i).contains(command[2])))) {
//                            System.out.println(getElementsOfList(list));
//                        }
//                    }
//                }
//                break;
//            default:
//                int indexHide = header.indexOf(command[1]);
//                System.out.println(getNotHiddenElements(header, indexHide));
//                for (List<String> strings : table) {
//                    System.out.println(getNotHiddenElements(strings, indexHide));
//                }
//                break;
//        }
//    }
//
//    private static boolean isHaveSortIndex(List<String> header, String sortIndex) {
//        for (String s : header) {
//            if (s.equals(sortIndex)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static int getIndex(int index, List<String> header, String word) {
//        for (String s : header) {
//            if (s.equals(word)) {
//                index = header.indexOf(s);
//            }
//        }
//        return index;
//    }
//
//    private static String getNotHiddenElements(List<String> header, int hiddenIndex) {
//        header.remove(hiddenIndex);
//        return getElementsOfList(header);
//    }
//
//    private static String getElementsOfList(List<String> header) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < header.size(); i++) {
//            if (i == header.size() - 1) {
//                result.append(header.get(i));
//            } else {
//                result.append(header.get(i)).append(" | ");
//            }
//        }
//        return result.toString();
//    }
//
//    private static void printElementsOfTable(List<List<String>> table) {
//        for (List<String> strings : table) {
//            System.out.println(getElementsOfList(strings));
//        }
//    }
//}
