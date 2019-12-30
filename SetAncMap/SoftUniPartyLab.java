package SetAncMap;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniPartyLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guests = scanner.nextLine();
        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        while (!guests.equals("PARTY")){
            if (Character.isDigit(guests.charAt(0))){
                vip.add(guests);
            } else {
                regular.add(guests);
            }
            guests = scanner.nextLine();
        }
        guests = scanner.nextLine();
        while (!guests.equals("END")){

            if (Character.isDigit(guests.charAt(0))){
                vip.remove(guests);
            } else {
                regular.remove(guests);
            }

            guests = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        printSet(vip);
        printSet(regular);
    }

    private static void printSet(TreeSet<String> guests) {
        for (String man : guests) {
            System.out.println(man);
        }
    }
}
