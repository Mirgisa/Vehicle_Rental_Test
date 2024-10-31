import java.util.List;

public interface Vehicle {
    void AddVehicle(Vehicle vehicle);

    void RemoveVehicle(Vehicle vehicle);

    boolean isFree();

    double calculateTotalPrice(int days);

    List<Car> carlist();
    List<Truck> trucklist();
    List<Motorcycle> cyclelist();

    String getLicensePlate();

    boolean isRented();

    String calculateTotalRentalPrice(int i);
}
