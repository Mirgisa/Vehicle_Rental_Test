import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truck extends Vehicle {
    private static final List<Truck> trucks = new ArrayList<>();
    private double pricePerDay;

    public Truck(String licencePlateNumber, String colour, double pricePerDay) {
        super(licencePlateNumber, String.valueOf(colour));
        this.pricePerDay = pricePerDay;
        trucks.add(this);
    }

    public static void addTruck(Scanner scanner) {
        System.out.print("Enter Truck license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Enter Truck color: ");
        String colour = scanner.nextLine();
        System.out.print("Enter Truck price per day: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Truck newTruck = new Truck(licensePlate, colour, price);
        trucks.add(newTruck);
        System.out.println("Truck added successfully.");
    }

    public static void removeTruck(Scanner scanner) {
        System.out.print("Enter the license plate of the car to remove: ");
        String licensePlate = scanner.nextLine();

        Truck truckToRemove = null;
        for (Truck truck : trucks) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                truckToRemove = truck;
                break;
            }
        }

        if (truckToRemove != null) {
            trucks.remove(truckToRemove);
            System.out.println("Truck removed successfully.");
        } else {
            System.out.println("Truck not found.");
        }
    }

    @Override
    public double calculateTotalPrice(int days) {
        return pricePerDay * days;
    }

    public static void truckList() {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    // Getters and setters
    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "pricePerDay=" + pricePerDay +
                '}';
    }
}