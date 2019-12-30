package SetAncMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLotLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        HashSet<String> cars = new HashSet<>();

        while (!tokens[0].equals("END")){
            if (tokens[0].equals("IN")){
                cars.add(tokens[1]);
            } else {
                cars.remove(tokens[1]);
            }
            tokens = scanner.nextLine().split(", ");
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
            return;
        }
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
