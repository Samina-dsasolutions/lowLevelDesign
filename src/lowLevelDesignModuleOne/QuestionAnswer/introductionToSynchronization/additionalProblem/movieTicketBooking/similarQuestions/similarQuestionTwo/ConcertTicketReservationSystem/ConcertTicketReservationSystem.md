# Q4. Concert Ticket Reservation System

## Overview

Design a ticket reservation system for a popular concert event. Multiple fans may try to purchase tickets simultaneously, so your system needs to handle high concurrency while maintaining data integrity. To prevent overselling tickets, a `ReentrantLock` will be used to synchronize access to the shared count of remaining tickets. The goal is to ensure that ticket reservations are accurate and fair under concurrent booking requests.

### Key Points:
- Keep track of remaining tickets for the concert.
- Allow multiple users to attempt booking at the same time.
- Support booking multiple tickets in one request.
- Prevent overbooking by controlling concurrent access with locking.

---

## Class Design: ConcertReservationSystem

### Attributes:
- `remainingTickets`: An integer representing how many tickets are still available.
- `reservationLock`: A `ReentrantLock` to serialize access to the ticket count.

### Initialization:
- Set `remainingTickets` according to total tickets available.
- Instantiate a `ReentrantLock` object.

### Reservation Method:
- `reserveTickets(int numTickets)`
    - Acquire the lock with `reservationLock.lock()`.
    - Check if there are enough tickets remaining.
    - If yes:
        - Deduct `numTickets` from `remainingTickets`.
        - Return `true` for a successful booking.
    - If no:
        - Return `false`.
    - Release the lock in a `finally` block to ensure proper synchronization.

### Availability Query:
- `getRemainingTickets()`
    - Return current `remainingTickets`.

---

## Summary
This ticket reservation system for a concert demonstrates how to manage high concurrency scenarios safely. By employing a `ReentrantLock`, it guarantees that multiple users attempting to buy tickets simultaneously do not cause inconsistent data states or overselling. Users can reserve multiple tickets at once and check remaining availability securely, ensuring a reliable and fair booking process.