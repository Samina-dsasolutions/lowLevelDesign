# Concurrency Problem - Traffic Light Intersection

## Problem Statement

At a busy intersection, there's a traffic light system that needs to coordinate the flow of vehicles from four directions: `North (N)`, `South (S)`, `East (E)`, and `West (W)`. Your goal is to implement a system that allows vehicles to pass through the intersection safely.

- **Threads involved:** `north`, `south`, `east`, and `west`.
- **Synchronization point:** The intersection where each thread must wait until it's safe for a vehicle to pass through.
- **Methods available:** `passNorth()`, `passSouth()`, `passEast()`, and `passWest()` which allow threads to enter the intersection.

### Constraints:
- Vehicles should pass through the intersection in groups of three: one from North or South, and two from East or West.
- All vehicles in one group must pass through before the next group starts.
- Arrival conditions:
    - If a North or South vehicle arrives with no other vehicles, it must wait for 2 East or West vehicles.
    - If an East or West vehicle arrives with no other vehicles, it must wait for 1 North or South vehicle and 1 more East or West vehicle.
- The sequence of vehicles passing should be divided into valid groups of `(N/S, E/W, E/W)` or `(E/W, E/W, N/S)` in any order.
- Vehicles from opposite directions (North-South or East-West) can pass simultaneously.

## Example 1
plaintext Input: vehicles = "NSEW" Output: "NSEW" Explanation: All permutations like "NSEW", "SNEW", "NSWE" are valid.

## Example 2
plaintext Input: vehicles = "NNSSEEEWWW" Output: "NSEWNSEWNS" Explanation: "SNEWSNEWNS", "NSEWSNEWNS" are also valid answers.

## Task

Implement the `TrafficLightSystem` class:

- `TrafficLightSystem()` Initializes the object.
- `void north(Runnable passNorth)` The North thread will call this method to enter the intersection.
- `void south(Runnable passSouth)` The South thread will call this method to enter the intersection.
- `void east(Runnable passEast)` The East thread will call this method to enter the intersection.
- `void west(Runnable passWest)` The West thread will call this method to enter the intersection.