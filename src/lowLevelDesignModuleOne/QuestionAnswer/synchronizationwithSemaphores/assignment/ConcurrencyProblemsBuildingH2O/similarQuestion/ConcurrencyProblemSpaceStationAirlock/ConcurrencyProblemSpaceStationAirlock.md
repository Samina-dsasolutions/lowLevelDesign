# Concurrency Problem - Space Station Airlock

## Problem Statement

On a space station, there's an airlock system that requires a specific sequence of operations to safely transfer astronauts between the station and space. The airlock can hold up to three astronauts and requires one operator. Your goal is to implement a system that coordinates the safe passage of astronauts through the airlock.

- **Threads involved:** `astronaut` and `operator`.
- **Synchronization point:** The airlock where each thread must wait until a complete cycle (1 Operator + 3 Astronauts) can be performed.
- **Methods available:** `enterAirlock()` for astronauts and `operateAirlock()` for the operator, which allow threads to participate in the airlock cycle.

### Constraints:
- The airlock should operate in cycles of four: one operator and three astronauts, completing the cycle immediately once the group is formed.
- All participants of one cycle must complete their actions before the next cycle begins.
- Arrival conditions:
    - If an astronaut arrives at an empty airlock, they must wait for 1 operator and 2 more astronauts.
    - If an operator arrives at an empty airlock, they must wait for 3 astronauts.
- The sequence of participants should be divided into valid groups of `(O, A, A, A)` where O is the operator and A is an astronaut, in any order within the group.

## Example 1
plaintext Input: participants = "OAAA" Output: "OAAA" Explanation: All permutations like "OAAA", "AOAA", "AAOA", "AAAO" are valid.

## Example 2
plaintext Input: participants = "OAAAOAAAAA" Output: "OAAAOAAAA" Explanation: "AOAAOAAAA", "OAAAAOAAA" are also valid answers.

## Task

Implement the `AirlockSystem` class:

- `AirlockSystem()` Initializes the object.
- `void astronaut(Runnable enterAirlock)` The Astronaut thread will call this method to enter the airlock.
- `void operator(Runnable operateAirlock)` The Operator thread will call this method to operate the airlock.