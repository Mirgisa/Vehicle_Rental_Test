import java.util.List;

public  class  Car extends VehicleInformation {
    public Car() {
        super();
    }

    @Override
    public void AddVehicle(Vehicle vehicle) {

    }

    @Override
    public void RemoveVehicle(Vehicle vehicle) {

    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public double calculateTotalPrice(int days) {
        return 0;
    }

    @Override
    public List<Car> carlist() {
        return List.of();
    }

    @Override
    public List<Truck> trucklist() {
        return List.of();
    }

    @Override
    public List<Motorcycle> cyclelist() {
        return List.of();
    }

    @Override
    public String getLicensePlate() {
        return " licensed";
    }

    @Override
    public boolean isRented() {
        return false;
    }

    @Override
    public String calculateTotalRentalPrice(int i) {
        return "";
    }
}
