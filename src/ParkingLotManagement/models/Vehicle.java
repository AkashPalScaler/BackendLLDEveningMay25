package ParkingLotManagement.models;

public class Vehicle {
    String reg_number;
    String owner_name;
    String owner_contact;
    VehicleType vehicleType;

    public Vehicle(String reg_number, String owner_name, String owner_contact, VehicleType vehicleType) {
        this.reg_number = reg_number;
        this.owner_name = owner_name;
        this.owner_contact = owner_contact;
        this.vehicleType = vehicleType;
    }
}
