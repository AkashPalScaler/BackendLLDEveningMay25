package ParkingLotManagement;

import ParkingLotManagement.controllers.TicketController;
import ParkingLotManagement.models.*;
import ParkingLotManagement.repository.GateRepository;
import ParkingLotManagement.repository.ParkingLotRepository;
import ParkingLotManagement.repository.VehicleRepository;
import ParkingLotManagement.services.TicketService;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // create controller
        // create service
        // create repository

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository  =new ParkingLotRepository();

        TicketService ticketService = new TicketService(vehicleRepository, gateRepository, parkingLotRepository);
        TicketController ticketController = new TicketController(ticketService);
        // Generate some pre data
        // Some gates, a parking lot, a parking, some parking slots
        Operator operator = new Operator("Akash", "NT155");
        Gate gateEntry1 =  new Gate(12, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateEntry2 =  new Gate(13, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit1 =  new Gate(14, GateType.ENTRY, GateStatus.OPEN, operator);
        Gate gateExit2 =  new Gate(15, GateType.ENTRY, GateStatus.OPEN, operator);

        ParkingLot parkingLot = new ParkingLot("Lodha Amara A");
        parkingLot.setStatus(ParkingLotStatus.EMPTY);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);


        //Entry gates
        List<Gate> entrygates = new ArrayList<>();
        entrygates.add(gateEntry1);
        entrygates.add(gateEntry2);
        parkingLot.setEntry_gates(entrygates);

        //Exit gates
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(gateExit1);
        exitGates.add(gateExit2);
        parkingLot.setExit_gates(exitGates);

        //Allocation strategy type
        parkingLot.setSlot_allocation_type(SlotAllocationType.RANDOM);

//        parkingLot.setSupportedVehicleTypes(null);
        parkingLot.setId(1234123L);


        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloor_number(1);
        parkingFloor.setStatus(FloorStatus.OPEN);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        List<AllowedVehicle> av1List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 3));
        List<AllowedVehicle> av2List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.CAR, 1));
        List<AllowedVehicle> av3List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 1));
        List<AllowedVehicle> av4List = new ArrayList<>();
        av1List.add(new AllowedVehicle(VehicleType.BIKE, 1));


        parkingSlots.add(new ParkingSlot("1", ParkingSlotStatus.EMPTY, av1List ));
        parkingSlots.add(new ParkingSlot("2", ParkingSlotStatus.EMPTY, av2List));
        parkingSlots.add(new ParkingSlot("3", ParkingSlotStatus.EMPTY, av3List));
        parkingSlots.add(new ParkingSlot("4", ParkingSlotStatus.EMPTY, av4List));
        parkingFloor.setParkingSlots(parkingSlots);

        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        parkingFloorList.add(parkingFloor);

        parkingLot.setFloors(parkingFloorList);
        gateEntry1.setParkingLot(parkingLot);
        gateEntry2.setParkingLot(parkingLot);
        gateExit1.setParkingLot(parkingLot);
        gateExit2.setParkingLot(parkingLot);

        gateRepository.save(gateEntry1);
        gateRepository.save(gateEntry2);
        gateRepository.save(gateExit1);
        gateRepository.save(gateExit2);

        parkingLotRepository.save(parkingLot);

        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setGate_id(1l);
        requestDTO.setOwner_name("Sam");
        requestDTO.setOwner_number("0000000000");
        requestDTO.setReg_number("MA12566788");
        requestDTO.setVehicle_type(VehicleType.CAR);

        IssueTicketResponseDTO responseDTO = ticketController.createTicket(requestDTO);

        if(responseDTO.getStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println(responseDTO.getResponseMessage());
            System.out.println("Ticket : " + responseDTO.getTicket_number() + " at slot :" + responseDTO.getSlot_number());
        }else{
            System.out.println(responseDTO.getResponseMessage());
        }

        IssueTicketRequestDTO requestDTO2 = new IssueTicketRequestDTO();
        requestDTO2.setGate_id(1l);
        requestDTO2.setOwner_name("Sami");
        requestDTO2.setOwner_number("0000000000");
        requestDTO2.setReg_number("MA12566789");
        requestDTO2.setVehicle_type(VehicleType.CAR);

        responseDTO = ticketController.createTicket(requestDTO2);

        if(responseDTO.getStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println(responseDTO.getResponseMessage());
            System.out.println("Ticket : " + responseDTO.getTicket_number() + " at slot :" + responseDTO.getSlot_number());
        }else{
            System.out.println(responseDTO.getResponseMessage());
        }

    }
}
