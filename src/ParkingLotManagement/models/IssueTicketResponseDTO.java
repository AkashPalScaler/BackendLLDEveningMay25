package ParkingLotManagement.models;

import java.util.Date;

public class IssueTicketResponseDTO {
    String ticket_number;
    Date entry_time;
    String slot_number;

    String responseMessage;
    ResponseStatus status;


    public IssueTicketResponseDTO() {
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public IssueTicketResponseDTO(String ticket_number, Date entry_time, String slot_number) {
        this.ticket_number = ticket_number;
        this.entry_time = entry_time;
        this.slot_number = slot_number;
    }

    public String getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(String ticket_number) {
        this.ticket_number = ticket_number;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public String getSlot_number() {
        return slot_number;
    }

    public void setSlot_number(String slot_number) {
        this.slot_number = slot_number;
    }
}
