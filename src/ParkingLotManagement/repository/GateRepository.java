package ParkingLotManagement.repository;

import ParkingLotManagement.models.Gate;

import java.util.Date;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    TreeMap<Long, Gate> gateStore = new TreeMap<>();
    Long previousId = 0l;

    public Gate save(Gate gate){
        gate.setId(previousId++);
        gate.setCreated_at(new Date());
        gate.setUpdated_at(new Date());
        gateStore.put(previousId, gate);
        return gate;
    }

    public Optional<Gate> getGateById(Long gateId){
        // DbConnection - select * from table_Gate where id='gateId'
        if(gateStore.containsKey(gateId)) {
            return Optional.of(gateStore.get(gateId));
        }
        return Optional.of(null);
    }
}


// HashMap - fetchById - O(1)
// TreeMap - sortedBykey