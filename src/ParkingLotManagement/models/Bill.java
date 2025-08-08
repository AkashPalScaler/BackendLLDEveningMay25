package ParkingLotManagement.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseClass {
    Double amount;
    Date exit_time;
    List<Payment> payments;
    Ticket ticket;
    Operator operator;
    Gate gate;
    BillStatus status;
}


// Cash - 90 UPI - 10