import java.util.List;

public abstract class CustomerInformation{
    private String name;
    private String email;
    public CustomerInformation(String name, String email){
        this.name = name;
        this.email = email;
    }

    public CustomerInformation() {
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
