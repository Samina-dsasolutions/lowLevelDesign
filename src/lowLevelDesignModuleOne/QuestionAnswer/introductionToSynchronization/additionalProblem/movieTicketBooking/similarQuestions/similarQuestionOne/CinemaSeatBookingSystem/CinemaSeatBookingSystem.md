# Q4. Cinema Seat Booking System

## Concept Overview

Design a system for booking seats in a cinema for a single movie. Multiple users may try to book tickets at the same time, so the system must handle these concurrent requests safely. To safeguard the seat count from inconsistencies due to simultaneous modifications, a mutual exclusion lock (ReentrantLock) will be used. The main goal is to prevent overbooking while allowing multiple users to reserve seats concurrently.

### Requirements:
- Track and manage the number of available seats.
- Allow several users to attempt reservations at the same moment.
- Enable users to book multiple seats in a single request.
- Avoid overselling by ensuring reservations only complete when enough seats remain.

---

## Class Design: MovieReservationSystem

### Components:
- `availableSeats`: Integer representing total remaining seats.
- `reservationLock`: A `ReentrantLock` to manage synchronized access.

### Initialization:
- Set the total seats to the provided initial count.
- Instantiate the `ReentrantLock` object for thread safety.

### Reservation Method:
- `reserveSeats(int numSeats)`
    - Lock the critical section with `reservationLock`.
    - Check whether enough seats are available.
    - If available:
        - Decrease `availableSeats` by `numSeats`.
        - Return `true`, indicating success.
    - Else:
        - Return `false`, indicating failure due to insufficient seats.
    - Unlock the `reservationLock` in the end block to release the lock.

### Seat Inquiry Method:
- `getAvailableSeats()`
    - Return the current number of remaining seats.

---

## Summary
This implementation efficiently manages seat reservations for a single movie showing. Leveraging a `ReentrantLock` guarantees that multiple booking attempts can be made near-simultaneously without risking data corruption or overbooking. Users can reserve multiple seats at once, and the system provides real-time seat availability checks, ensuring fair and consistent booking operations even under high concurrency.