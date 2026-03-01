package com.scenarios.parkingalot;

public class ParkingSlot {
    private int slotId;
    private VehicleType supportedType;
    private boolean occupied;
    private Vehicle vehicle;

    public ParkingSlot(int slotId, VehicleType supportedType) {
        this.slotId = slotId;
        this.supportedType = supportedType;
        this.occupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return !occupied && vehicle.getType() == supportedType;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = null;
        this.occupied = true;
    }

    public void  removedVehicle(){
        this.vehicle = null;
        this.occupied = false;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public int getSlotId(){
        return slotId;
    }
}
