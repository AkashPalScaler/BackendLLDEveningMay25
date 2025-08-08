package ParkingLotManagement.models;

import java.util.List;

public class ParkingLot extends BaseClass {
    String name;
    List<ParkingFloor> floors;
    List<AllowedVehicle> allowed_vehicles;
    ParkingLotStatus status;
    List<Gate> entry_gates;
    List<Gate> exit_gates;
    FeeCalculationType fee_calculation_type;
    SlotAllocationType slot_allocation_type;
}
