package ParkingLotManagement.models;

import java.util.List;

public class ParkingFloor extends BaseClass{
    Integer floor_number;
    FloorStatus status;
    List<ParkingSlot> parkingSlots;
    List<AllowedVehicle> allowedVehicles;

    public Integer getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(Integer floor_number) {
        this.floor_number = floor_number;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<AllowedVehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<AllowedVehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
