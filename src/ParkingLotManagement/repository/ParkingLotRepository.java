package ParkingLotManagement.repository;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.ParkingLot;

import java.util.Date;
import java.util.TreeMap;

public class ParkingLotRepository {
    TreeMap<Long, ParkingLot> parkingLotStore = new TreeMap<>();
    Long previousId = 0l;

    public ParkingLot save(ParkingLot parkingLot){
        parkingLot.setId(previousId++);
        parkingLot.setCreated_at(new Date());
        parkingLot.setUpdated_at(new Date());
        parkingLotStore.put(previousId, parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLotByGate(Gate gate){
        return gate.getParkingLot();
    }

//    public ParkingLot getParkingLotById();
//    public ParkingLot getParkingLotByName();
}

