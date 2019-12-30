package DemoEx.SoftUniParking.softUniParking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parking {
    private Map<String, Car> cars;
    private int capacity;

    public Parking(int capacity) {
        this.cars = new HashMap<>();
        this.capacity = capacity;
    }

    public String addCar(Car car) {
        if (this.cars.containsValue(car)) {
            return String.format("Car with that registration number, already exists!%n" );
        } else if (this.cars.size() >= this.capacity) {
            return "Parking is full!";
        } else {
            cars.put(car.getMake(), car);
            return String.format("Successfully added new car %s %s%n",
                    car.getMake(), this.cars.get(car.getMake()).getRegistrationNumber());
        }
    }

    public String getCar(String registrationNumber) {
        List<Car> c = this.cars.values().stream().filter(f -> f.getRegistrationNumber().equals(registrationNumber)).collect(Collectors.toList());
        String make = "";
        for (Car car : c) {
            make = "Make: " + car.getMake() + "\r\nModel: " + car.getModel() +
                    "\r\nHorsePower: " + car.getHorsePower() + "\r\nRegistrationNumber: " + car.getRegistrationNumber() + "\r\n";
        }
        return make;
    }

    public String removeCar(String registrationNumber) {
        List<Car> c = this.cars.values().stream().filter(f -> f.getRegistrationNumber().equals(registrationNumber)).collect(Collectors.toList());
        if (c.isEmpty()) {
            return "Car with that registration number, doesn't exists!";
        }
        String make = "";
        for (Car car : c) {
            make = car.getMake();
        }
        this.cars.remove(make);
        return "Successfully removed " + registrationNumber;
    }

    public int getCount(){
        return this.cars.size();
    }

    public void removeSetOfRegistrationNumber(List<String> registrationNumbers){
        for (String registrationNumber : registrationNumbers) {

        }
    }
}

