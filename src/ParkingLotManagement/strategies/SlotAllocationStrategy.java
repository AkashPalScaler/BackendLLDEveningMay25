package ParkingLotManagement.strategies;

import ParkingLotManagement.models.ParkingLot;
import ParkingLotManagement.models.ParkingSlot;
import ParkingLotManagement.models.VehicleType;

import java.util.Optional;

public interface SlotAllocationStrategy {
    public Optional<ParkingSlot> allocateSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
