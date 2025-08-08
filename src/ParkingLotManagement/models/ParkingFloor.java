package ParkingLotManagement.models;

import java.util.List;

public class ParkingFloor extends BaseClass{
    Integer floor_number;
    FloorStatus status;
    List<ParkingSlot> parkingSlots;
    List<AllowedVehicle> allowedVehicles;
}
