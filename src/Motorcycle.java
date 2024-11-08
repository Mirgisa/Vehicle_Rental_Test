import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private static final List<Motorcycle> motors = new ArrayList<>();
    private double pricePerDay;

    public Motorcycle(String licencePlateNumber,String colour,double pricePerDay) {
        super(licencePlateNumber, String.valueOf(colour));
        this.pricePerDay = pricePerDay;
        motors.add(this);
    }

    public static void addMotor(Scanner scanner) {
        System.out.print("Enter Motor license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Enter Motor color: ");
        String colour = scanner.nextLine();
        System.out.print("Enter Motor price per day: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Motorcycle newMotor = new Motorcycle(licensePlate, colour, price);
        motors.add(newMotor);
        System.out.println("Motor added successfully.");
    }

    public static void removeMotor(Scanner scanner) {
        System.out.print("Enter the license plate of the car to remove: ");
        String licensePlate = scanner.nextLine();

        Motorcycle motorToRemove = null;
        for (Motorcycle motor : motors) {
            if (motor.getLicensePlate().equals(licensePlate)) {
                motorToRemove = motor;
                break;
            }
        }

        if (motorToRemove != null) {
            motors.remove(motorToRemove);
            System.out.println("Motor removed successfully.");
        } else {
            System.out.println("Motor not found.");
        }
    }

    @Override
    public double calculateTotalPrice(int days) {
        return pricePerDay * days;
    }

    public static void motorList() {
        for (Motorcycle motor : motors) {
            System.out.println(motor);
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
        return "Motorcycle{" +
                "pricePerDay=" + pricePerDay +
                '}';
    }
}