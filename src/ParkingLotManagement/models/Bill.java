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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getExit_time() {
        return exit_time;
    }

    public void setExit_time(Date exit_time) {
        this.exit_time = exit_time;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }
}


// Cash - 90 UPI - 10