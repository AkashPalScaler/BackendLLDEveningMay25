package ParkingLotManagement.controllers;

import ParkingLotManagement.models.*;
import ParkingLotManagement.services.TicketService;

import java.sql.SQLOutput;
// Singletons for controller, service, repository - Springboot
// @Controller
public class TicketController {
    // @Autowired
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO createTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO responseDTO;
        try{

            // Basic validation should be done on requestDTO
            Ticket ticket = ticketService.createTicket(requestDTO.getGate_id(), requestDTO.getReg_number(), requestDTO.getOwner_name(), requestDTO.getOwner_number(), requestDTO.getVehicle_type());

            responseDTO = new IssueTicketResponseDTO(
                    ticket.getNumber(),
                    ticket.getEntry_time(),
                    ticket.getParkingSlot().getNumber()
            );

            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setResponseMessage("Ticket created successfully");
        }catch(Exception e){
            System.out.println("Error occured in create ticket : " + e.getMessage());
            responseDTO = new IssueTicketResponseDTO();
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setResponseMessage("Ticket creation failed + " + e.getMessage());
        }
        return responseDTO;
    }
}

// Agenda - Ticket generation completed
// client class- how to hardcode and run a flow
// in memory db- repository
