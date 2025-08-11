package ParkingLotManagement.services;

import ParkingLotManagement.models.*;
import ParkingLotManagement.repository.GateRepository;
import ParkingLotManagement.repository.ParkingLotRepository;
import ParkingLotManagement.repository.VehicleRepository;
import ParkingLotManagement.strategies.SlotAllocationStrategy;
import ParkingLotManagement.strategies.SlotAllocationStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;

    public TicketService(VehicleRepository vehicleRepository, GateRepository gateRepository, ParkingLotRepository parkingLotRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    // constructor - dependency injection
    public Ticket createTicket(Long gateId, String regNo, String ownerName, String ownerNo, VehicleType vehicleType){
        // 1. We want to create ticket with all required data
//            - Get gate - getGateById -  in memory db
                Optional<Gate> gateOptional = gateRepository.getGateById(gateId);
                if(gateOptional.isEmpty()){
                    throw new RuntimeException("Invalid gate");
                }
                Gate gate = gateOptional.get();
                Ticket ticket = new Ticket();
                ticket.setNumber("182623"); // UUID - UUID generator

                ticket.setGate(gate);
        //     - Add entry time
                ticket.setEntry_time(new Date());
//            - Operator - we cn get from gate
                ticket.setOperator(gate.getOperator());
//            - Get Vehicle - findOrCreateVehicle - in memory db
                Vehicle vehicle = vehicleRepository.findOrCreateVehicle(regNo, ownerName, ownerNo, vehicleType);
                ticket.setVehicle(vehicle);

//        2. Allocated a slot to the ticket
            // Slot Allocation strategy
            // Fetch Parking lot - getParkingLotByGateId
           ParkingLot parkingLot = gate.getParkingLot();
            // call the slot allocation with parking lot - get the strategy from factory
        Optional<ParkingSlot> parkingSlotOptional = SlotAllocationStrategyFactory
                .getStrategy(parkingLot.getSlot_allocation_type(), parkingLotRepository)
                .allocateSlot(parkingLot, vehicle.getVehicleType());
        if(parkingSlotOptional.isEmpty()){
            System.out.println("Parking lot is filled");
            throw new RuntimeException("Parking Lot Is filled");
        }
        ticket.setParkingSlot(parkingSlotOptional.get());
        return ticket;
    }
}


// createTicket
// 1. We want to create ticket with all required data
// 2. Allocated a slot to the ticket
// 3. Save and return ticket