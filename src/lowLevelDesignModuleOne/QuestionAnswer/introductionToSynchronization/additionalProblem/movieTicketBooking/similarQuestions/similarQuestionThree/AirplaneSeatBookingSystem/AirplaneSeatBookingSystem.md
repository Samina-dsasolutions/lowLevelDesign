# Q4. Airplane Seat Booking System

## Scenario Overview

Imagine developing a booking platform for flights where passengers can reserve seats on a specific airplane. Since many travelers might try to reserve seats at the same time, your system must coordinate concurrent requests effectively. By using a `ReentrantLock`, the system ensures that seat counts are updated accurately, preventing overbooking and ensuring fair distribution of seats.

### Main Features:
- Track the number of available seats in the airplane.
- Handle multiple booking requests simultaneously.
- Allow users to book multiple seats in a single transaction.
- Guarantee data consistency and prevent overselling under concurrent access.

---

## Class Design: AirplaneReservationSystem

### Attributes:
- `availableSeats`: An integer indicating how many seats are still open.
- `reservationLock`: A `ReentrantLock` to synchronize access to the seat count.

### Constructor:
- Initializes `availableSeats` with the total number of seats on the plane.
- Creates an instance of `ReentrantLock` for thread safety.

### Methods:

#### reserveSeats(int numSeats)
- Purpose: To process seat reservations.
- Process:
    - Acquire `reservationLock`.
    - Check if enough seats are available.
    - If available:
        - Reduce `availableSeats` by `numSeats`.
        - Return `true` to confirm reservation success.
    - Else:
        - Return `false`.
    - Release `reservationLock` in the `finally` block to maintain thread safety.

#### getRemainingSeats()
- Purpose: To fetch the current number of available seats.
- Simply returns the current value of `availableSeats`.

---

## Summary
This airplane seat booking system efficiently manages concurrent reservation requests. Using a `ReentrantLock` ensures that only one thread can update the seat count at a time, which prevents overbooking and maintains the integrity of seat reservations. Passengers can book multiple seats in a single attempt, and the system consistently provides up-to-date information on remaining seats, even under high demand.