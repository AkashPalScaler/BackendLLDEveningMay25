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

    public ParkingLot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<AllowedVehicle> getAllowed_vehicles() {
        return allowed_vehicles;
    }

    public void setAllowed_vehicles(List<AllowedVehicle> allowed_vehicles) {
        this.allowed_vehicles = allowed_vehicles;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public List<Gate> getEntry_gates() {
        return entry_gates;
    }

    public void setEntry_gates(List<Gate> entry_gates) {
        this.entry_gates = entry_gates;
    }

    public List<Gate> getExit_gates() {
        return exit_gates;
    }

    public void setExit_gates(List<Gate> exit_gates) {
        this.exit_gates = exit_gates;
    }

    public FeeCalculationType getFee_calculation_type() {
        return fee_calculation_type;
    }

    public void setFee_calculation_type(FeeCalculationType fee_calculation_type) {
        this.fee_calculation_type = fee_calculation_type;
    }

    public SlotAllocationType getSlot_allocation_type() {
        return slot_allocation_type;
    }

    public void setSlot_allocation_type(SlotAllocationType slot_allocation_type) {
        this.slot_allocation_type = slot_allocation_type;
    }
}
