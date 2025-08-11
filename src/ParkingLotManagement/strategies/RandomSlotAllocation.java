package ParkingLotManagement.strategies;

import ParkingLotManagement.models.*;
import ParkingLotManagement.repository.ParkingLotRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
//@Strategy/ @Component
public class RandomSlotAllocation implements SlotAllocationStrategy{
    ParkingLotRepository parkingLotRepository;

    public RandomSlotAllocation(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public Optional<ParkingSlot> allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        if(parkingLot.getStatus().equals(ParkingLotStatus.FILLED)){
            return Optional.empty();
        }
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();

        for(ParkingFloor floor : parkingFloors){
            if(floor.getStatus().equals(FloorStatus.FILLED)){
                continue;
            }

            for(ParkingSlot parkingSlot: floor.getParkingSlots()){
                if(parkingSlot.getStatus().equals(ParkingSlotStatus.EMPTY)){
                    for(AllowedVehicle allowedVehicle : parkingSlot.getAllowedVehicles()){
                        if(allowedVehicle.getType().equals(vehicleType) && allowedVehicle.getCapacity() > 0){
                            // reduce the capacity
                            allowedVehicle.setCapacity(allowedVehicle.getCapacity() - 1);
                            parkingSlot.setStatus(ParkingSlotStatus.FILLED);
                            // ParkingSlotRepository.update(parkingSlot)
                            return Optional.of(parkingSlot);
                        }
                    }
                }
            }
        }


        return Optional.empty();
    }
}
