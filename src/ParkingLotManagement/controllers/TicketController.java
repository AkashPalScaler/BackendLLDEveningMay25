package ParkingLotManagement.controllers;

import ParkingLotManagement.models.*;
import ParkingLotManagement.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO createTicket(IssueTicketRequestDTO requestDTO){
        Vehicle vehicle = new Vehicle(requestDTO.getReg_number(), requestDTO.getOwner_name(), requestDTO.getOwner_number(), requestDTO.getVehicle_type());
        Gate gate = new Gate(); // Use the request dto's gate_id to fetch the correct data
        Ticket ticket = ticketService.createTicket(vehicle, gate);

        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO(
                ticket.getNumber(),
                ticket.getEntry_time(),
                ticket.getParkingSlot().getNumber()
        );

        return responseDTO;
    }
}
