package ParkingLotManagement.repository;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.Vehicle;
import ParkingLotManagement.models.VehicleType;

import java.util.Date;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    TreeMap<String, Vehicle> vehicleStore = new TreeMap<>();
    Long previousId = 0l;

    public Vehicle save(Vehicle vehicle){
        vehicle.setId(previousId++);
        vehicle.setCreated_at(new Date());
        vehicle.setUpdated_at(new Date());
        vehicleStore.put(vehicle.getReg_number(), vehicle);
        return vehicle;
    }

    public Vehicle findOrCreateVehicle(String regNo, String ownerName, String ownerNo, VehicleType vehicleType){
        // Not search by ID, need to search by regNo (Set an Index, secondary Key)
        if(vehicleStore.containsKey(regNo)){
            return vehicleStore.get(regNo);
        }
        Vehicle vehicle = new Vehicle(regNo, ownerName, ownerNo, vehicleType);
        return save(vehicle);
    }

}
