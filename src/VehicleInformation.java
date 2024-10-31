import java.util.List;

public abstract class VehicleInformation{
    private String licensePlate;
    private String colour;
    private double pricePerDay;

    public VehicleInformation(String licensePlate, String colour,double pricePerDay){
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.pricePerDay = pricePerDay;
    }

    public VehicleInformation() {

    }

    public abstract void AddVehicle(Vehicle vehicle);

    public abstract void RemoveVehicle(Vehicle vehicle);

    public abstract boolean isFree();

    public abstract double calculateTotalPrice(int days);

    public abstract List<Car> carlist();

    public abstract List<Truck> trucklist();

    public abstract List<Motorcycle> cyclelist();

    public abstract String getLicensePlate();

    public abstract boolean isRented();

    public abstract String calculateTotalRentalPrice(int i);
}

