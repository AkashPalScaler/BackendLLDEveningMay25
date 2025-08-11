package ParkingLotManagement.models;

public class AllowedVehicle extends  BaseClass{
    VehicleType type;
    Integer capacity;

    public AllowedVehicle(VehicleType type, Integer capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
