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
        switch (choice) {
            case 1:
                Car.CarList();
                break;
            case 2:
                Car.addCar(scanner);
                break;
            case 3:
                Car.removeCar(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void handleTrucks(Scanner scanner) {
        System.out.println("\n--- Truck Menu ---");
        System.out.println("1. List Trucks");
        System.out.println("2. Add Truck");
        System.out.println("3. Remove Truck");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                Truck.truckList();
                break;
            case 2:
                Truck.addTruck(scanner);
                break;
            case 3:
                Truck.removeTruck(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

    private static void handleMotorcycles(Scanner scanner) {
        System.out.println("\n--- Motorcycle Menu ---");
        System.out.println("1. List Motorcycles");
        System.out.println("2. Add Motorcycle");
        System.out.println("3. Remove Motorcycle");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                Motorcycle.motorList();
                break;
            case 2:
                Motorcycle.addMotor(scanner);
                break;
            case 3:
                Motorcycle.removeMotor(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        // TODO: Implement motorcycle-specific actions
        System.out.println("Motorcycle action not yet implemented.");

        Car car = new Car("0054","Red",6000);
        // Truck truck = new Truck(778,"green",9000.00);
        //Motorcycle motorcycle = new Motorcycle(004,"Red,5000");

      //  List<Car> cars = new ArrayList<>();
      //  car.add(cars);

        Vehicle car1 =new Car("00088","Red",500);
        Vehicle car2 = new Car("00123","Blue",600);
        Vehicle truck1 = new Truck("750","green",6000);
        Vehicle truck2 = new Truck("777","Red",5000);
        Vehicle motorcycle1 = new Motorcycle("005","Red",5000);
        Vehicle motorcycle2 = new Motorcycle("006","Blue",5000);





    }
}