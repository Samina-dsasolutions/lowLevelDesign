# Q4. Conference Room Booking System

## Scenario Overview

Design a system that allows employees to reserve slots in a conference room for meetings. Since multiple employees may try to book the room at the same time, the system must handle concurrent reservation requests carefully. By utilizing a `ReentrantLock`, the system will ensure that the total available time slots for the room are accurately managed, preventing double bookings and maintaining schedule integrity.

### Features:
- Keep track of the total available time slots for the conference room.
- Support multiple employees attempting to reserve meeting times simultaneously.
- Allow reserving multiple time slots in one request.
- Prevent overlapping bookings and over-commitment through thread-safe operations.

---

## Class Design: ConferenceRoomReservation

### Attributes:
- `availableTimeSlots`: Integer representing the number of free time slots (e.g., hours or blocks).
- `reservationLock`: A `ReentrantLock` to control concurrent access.

### Constructor:
- Initialize `availableTimeSlots` with total available slots for the day.
- Instantiate a `ReentrantLock` for synchronization.

### Methods:

#### reserveSlots(int numSlots)
- Purpose: To reserve a specified number of time slots.
- Process:
    - Lock the `reservationLock`.
    - Check if enough slots are available.
    - If yes:
        - Deduct `numSlots` from `availableTimeSlots`.
        - Return `true`.
    - Else:
        - Return `false`.
    - Unlock the lock in a `finally` block for thread safety.

#### getAvailableSlots()
- Purpose: To get the current number of free time slots.
- Returns the current value of `availableTimeSlots`.

---

## Summary
This conference room reservation system ensures multiple employees can book meeting slots concurrently without conflicts. The use of `ReentrantLock` guarantees that updates to available time slots are performed atomically, preventing double-booking and scheduling conflicts. Whether booking single or multiple slots, users receive accurate, real-time information about conference room availability.