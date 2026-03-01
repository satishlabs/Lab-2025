package com.scenarios.parkingalot;

import java.util.*;

public class ParkingLot {

    private List<ParkingSlot> slots = new ArrayList<>();
    private Map<String, ParkingTicket> activeTickets = new HashMap<>();

    public ParkingLot(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    // 🔹 Find available slot
    public ParkingSlot findAvailableSlot(Vehicle vehicle) {
        return slots.stream()
                .filter(slot -> slot.canFitVehicle(vehicle))
                .findFirst()
                .orElse(null);
    }

    // 🔹 Park vehicle
    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingSlot slot = findAvailableSlot(vehicle);

        if (slot == null) {
            throw new RuntimeException("No slot available");
        }

        slot.parkVehicle(vehicle);
        ParkingTicket ticket = new ParkingTicket(slot, vehicle);
        activeTickets.put(ticket.getSlot().getSlotId()+"", ticket);

        return ticket;
    }

    // 🔹 Unpark vehicle
    public double unparkVehicle(String ticketId) {
        ParkingTicket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            throw new RuntimeException("Invalid ticket");
        }

       // ticket.getSlot().removeVehicle();

        double fee = calculateFee(ticket);
        ticket.closeTicket(fee);

        activeTickets.remove(ticketId);
        return fee;
    }

    // 🔹 Fee calculation
    private double calculateFee(ParkingTicket ticket) {
        return 50.0; // simplified
    }
}
