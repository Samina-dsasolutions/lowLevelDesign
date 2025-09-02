# Concurrency Problem - Amusement Park Ride

## Problem Statement

At an amusement park, there's a popular ride that requires exactly four people to operate: two adults (A) and two children (C). Your goal is to implement a system that groups visitors efficiently for this ride.

- **Threads involved:** `adult` and `child`.
- **Synchronization point:** The ride entrance where each thread must wait until a complete group (2 Adults + 2 Children) can be formed.
- **Methods available:** `boardAdult()` and `boardChild()` which allow threads to enter the ride.

### Constraints:
- Visitors should board the ride in groups of four: two adults and two children, starting the ride immediately once a group is formed.
- All visitors of one group must board before the next group starts boarding.
- Arrival conditions:
    - If an adult arrives with no other visitors, they must wait for 1 more adult and 2 children.
    - If a child arrives with no other visitors, they must wait for 2 adults and 1 more child.
- The sequence of visitors boarding should be divided into valid groups of `(A, A, C, C)` in any order.

## Example 1
plaintext Input: visitors = "AACC" Output: "AACC" Explanation: All permutations like "AACC", "ACAC", "ACCA" are valid.

## Example 2
plaintext Input: visitors = "AACCAACCCC" Output: "AACCAACCAC" Explanation: "CAACAACCAC", "AACCACAACC" are also valid answers.

## Task

Implement the `RideGrouper` class:

- `RideGrouper()` Initializes the object.
- `void adult(Runnable boardAdult)` The Adult thread will call this method to enter the ride.
- `void child(Runnable boardChild)` The Child thread will call this method to enter the ride.