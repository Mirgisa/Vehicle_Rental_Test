
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String vehicleType;
    private String licencePlateNumber;
    private List<Vehicle> vehicles;
    private String colour;
    private boolean isRented;

    public Vehicle(String vehicleType, String licencePlateNumber) {
        this.vehicleType = vehicleType;
        this.licencePlateNumber = licencePlateNumber;
        this.colour = colour;
        this.isRented = false;
        this.vehicles = new ArrayList<>();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFree() {
        return !isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getLicensePlate() {
        return licencePlateNumber;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles == null) {
            vehicles = new ArrayList<>();
        }
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicles != null) {
            vehicles.remove(vehicle);
        }
    }

    /**
     * Calculate the total rental price for the given number of days.
     * @param days The number of days for the rental period.
     * @return The total price for the rental.
     */
    public abstract double calculateTotalPrice(int days);

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", licencePlateNumber='" + licencePlateNumber + '\'' +
                ", vehicles=" + vehicles +
                ", colour='" + colour + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
