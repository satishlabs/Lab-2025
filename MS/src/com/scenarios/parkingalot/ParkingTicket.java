package com.scenarios.parkingalot;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {

    private String ticketId;
    private ParkingSlot slot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double fee;

    public ParkingTicket(ParkingSlot slot, Vehicle vehicle) {
        this.ticketId = UUID.randomUUID().toString();
        this.slot = slot;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public void closeTicket(double fee) {
        this.exitTime = LocalDateTime.now();
        this.fee = fee;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}