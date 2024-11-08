import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {
    private static final List<Car> cars = new ArrayList<>();
    private double pricePerDay;

    public Car(String licensePlate, String colour, double pricePerDay) {
        super("Car", licensePlate);
        this.pricePerDay = pricePerDay;
//        this.licensePlate = licensePlate;
//        this.colour=colour;
        cars.add(this);


    }


    public static void addCar(Scanner scanner) {
        System.out.print("Enter car license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Enter car color: ");
        String colour = scanner.nextLine();
        System.out.print("Enter car price per day: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Car newCar = new Car(licensePlate, colour, price);
        cars.add(newCar);
        System.out.println("Car added successfully.");
    }

    public static void removeCar(Scanner scanner) {
        System.out.print("Enter the license plate of the car to remove: ");
        String licensePlate = scanner.nextLine();

        Car carToRemove = null;
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                carToRemove = car;
                break;
            }
        }

        if (carToRemove != null) {
            cars.remove(carToRemove);
            System.out.println("Car removed successfully.");
        } else {
            System.out.println("Car not found.");
        }
    }

    @Override
    public double calculateTotalPrice(int days) {
        return pricePerDay * days;
    }

    public static void CarList() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // Getters and setters
//    public double getPricePerDay() {
//        return pricePerDay;
//    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pricePerDay=" + pricePerDay +
                '}';
    }
}