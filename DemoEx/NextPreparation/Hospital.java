package DemoEx.NextPreparation;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.util.stream.Collectors;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, LinkedHashMap<Integer, LinkedHashSet<String>>> departments = new LinkedHashMap<>();
        TreeMap<String, TreeSet<String>> doctors = new TreeMap<>();
        int room = 1;
        int counter = 0;
        while (!tokens[0].equals("Output")) {
            String department = tokens[0];
            String doctor = tokens[1] + " " + tokens[2];
            String patient = tokens[3];

            doctors.putIfAbsent(doctor, new TreeSet<>());
            doctors.get(doctor).add(patient);

            if (counter == 3) {
                room++;
                counter = 0;
            }
            departments.putIfAbsent(department, new LinkedHashMap<>());
            departments.get(department).putIfAbsent(room, new LinkedHashSet<>());
            if (departments.get(department).get(room).size() <= 3) {
                departments.get(department).get(room).add(patient);
                counter++;
            }

            tokens = scanner.nextLine().split("\\s+");
        }

        String[] command = scanner.nextLine().split("\\s+");

    }
}
