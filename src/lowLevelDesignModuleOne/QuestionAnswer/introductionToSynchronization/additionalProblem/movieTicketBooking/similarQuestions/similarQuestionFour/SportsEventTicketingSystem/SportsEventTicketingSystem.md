# Q4. Sports Event Ticketing System

## Scenario Overview

Imagine creating an online platform for booking tickets to a major sports event. Multiple fans may try to purchase tickets at the same time, necessitating a system that handles high concurrency safely. By implementing a `ReentrantLock`, you can ensure that the total number of sold tickets never exceeds the available supply and that all reservations are processed accurately.

### Key Features:
- Track the total number of tickets available for the event.
- Support simultaneous booking attempts from many users.
- Allow users to purchase multiple tickets in one transaction.
- Prevent overselling by controlling access through locking mechanisms.

---

## Class Design: SportsEventReservation

### Attributes:
- `totalTickets`: Integer representing the total tickets issued for the event.
- `reservationLock`: A `ReentrantLock` to synchronize ticket reservations.

### Constructor:
- Initialize `totalTickets` with the total number of tickets allocated.
- Create a new `ReentrantLock` instance for thread safety.

### Methods:

#### reserveTickets(int numTickets)
- Purpose: To reserve a specified number of event tickets.
- Process:
    - Acquire the `reservationLock`.
    - Check if enough tickets are remaining.
    - If yes:
        - Deduct `numTickets` from `totalTickets`.
        - Return `true` indicating a successful purchase.
    - Otherwise:
        - Return `false`.
    - Release the lock in a `finally` block to ensure proper synchronization.

#### getRemainingTickets()
- Purpose: To query the current number of tickets still available.
- Returns the current value of `totalTickets`.

---

## Summary
This sports event ticketing system provides a reliable way to handle multiple concurrent booking requests. Using a `ReentrantLock`, it guarantees that the total tickets sold never surpass the maximum available, avoiding overselling. Customers can book multiple tickets at once, and the system accurately reflects ticket availability in real-time, even during periods of high volume.