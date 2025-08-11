package ParkingLotManagement.models;
// 1000 times I fetch gate
// 100 time I also use parkinglot - fetchParkingLotByID - and take ID in input
// gate - id \ number \ parking_lot_id
public class Gate extends BaseClass {
    GateType type;
    Integer gate_no;
    Operator operator;
    GateStatus status;
    ParkingLot parkingLot;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Gate(Integer gate_no, GateType type, GateStatus status, Operator operator) {
        this.type = type;
        this.gate_no = gate_no;
        this.operator = operator;
        this.status = status;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Integer getGate_no() {
        return gate_no;
    }

    public void setGate_no(Integer gate_no) {
        this.gate_no = gate_no;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }
}
