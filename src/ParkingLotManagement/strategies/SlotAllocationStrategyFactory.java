package ParkingLotManagement.strategies;

import ParkingLotManagement.models.ParkingLot;
import ParkingLotManagement.models.SlotAllocationType;
import ParkingLotManagement.repository.ParkingLotRepository;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getStrategy(SlotAllocationType type, ParkingLotRepository parkingLotRepository){
        if(type.equals(SlotAllocationType.RANDOM)){
            return new RandomSlotAllocation(parkingLotRepository);
        }
        throw new RuntimeException("Invalid slot allocation type");
    }
}
