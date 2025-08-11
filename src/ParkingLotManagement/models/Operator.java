package ParkingLotManagement.models;

public class Operator extends BaseClass {
    String name;
    String emp_id;
    Gate gate;

    public Operator(String name, String emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
