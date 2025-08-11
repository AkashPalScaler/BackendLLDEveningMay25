package ParkingLotManagement.models;

public class IssueTicketRequestDTO {
    String reg_number;
    String owner_name;
    String owner_number;
    VehicleType vehicle_type;
    Long gate_id;
//    Long parkingLot_id;

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_number() {
        return owner_number;
    }

    public void setOwner_number(String owner_number) {
        this.owner_number = owner_number;
    }

    public VehicleType getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(VehicleType vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Long getGate_id() {
        return gate_id;
    }

    public void setGate_id(Long gate_id) {
        this.gate_id = gate_id;
    }
}
