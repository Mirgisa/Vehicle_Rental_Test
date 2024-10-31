import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Vehicle Menu ---");
            System.out.println("1. Cars");
            System.out.println("2. Trucks");
            System.out.println("3. Motorcycles");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    handleCars(scanner);
                    break;
                case 2:
                    handleTrucks(scanner);
                    break;
                case 3:
                    handleMotorcycles(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Vehicle Menu. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleCars(Scanner scanner) {
        System.out.println("\n--- Car Menu ---");
        System.out.println("1. List Cars");
        System.out.println("2. Add Car");
        System.out.println("3. Remove Car");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // TODO: Implement car-specific actions
        System.out.println("Car action not yet implemented.");
    }

    private static void handleTrucks(Scanner scanner) {
        System.out.println("\n--- Truck Menu ---");
        System.out.println("1. List Trucks");
        System.out.println("2. Add Truck");
        System.out.println("3. Remove Truck");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // TODO: Implement truck-specific actions
        System.out.println("Truck action not yet implemented.");
    }

    private static void handleMotorcycles(Scanner scanner) {
        System.out.println("\n--- Motorcycle Menu ---");
        System.out.println("1. List Motorcycles");
        System.out.println("2. Add Motorcycle");
        System.out.println("3. Remove Motorcycle");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // TODO: Implement motorcycle-specific actions
        System.out.println("Motorcycle action not yet implemented.");

        Car car = new Car();
        // Truck truck = new Truck(778,"green",9000.00);
        //Motorcycle motorcycle = new Motorcycle(004,"Red,5000");

        List<Car> vehicles = new ArrayList<>();
        vehicles.add(car);


        for (Car vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getLicensePlate());
            System.out.println("Is rented: " + (vehicle.isRented() ? "Yes" : "No"));
            System.out.println("Total rental price: " + vehicle.calculateTotalRentalPrice(5));
            System.out.println("Last 5 rentals:");
            Object Rental;
        }
    }
}