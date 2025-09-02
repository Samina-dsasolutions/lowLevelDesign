# Concurrency Problem - Musical Quartet Coordinator

## Problem Statement

A music conservatory is organizing a series of quartet performances. Each quartet requires exactly four musicians: one Violinist (V), one Cellist (C), and two Violists (A). Your goal is to implement a system that efficiently groups musicians for these quartets.

- **Threads involved:** `violinist`, `cellist`, and `violist`.
- **Synchronization point:** The rehearsal room where each thread must wait until a complete quartet (1 Violinist + 1 Cellist + 2 Violists) can be formed.
- **Methods available:** `playViolin()`, `playCello()`, and `playViola()` which allow threads to enter the rehearsal room.

### Constraints:
- Musicians should form quartets in groups of four: one Violinist, one Cellist, and two Violists, starting the performance immediately once a group is formed.
- All musicians of one quartet must enter the rehearsal room before the next quartet starts forming.
- Arrival conditions:
    - If a Violinist arrives with no other musicians, they must wait for 1 Cellist and 2 Violists.
    - If a Cellist arrives with no other musicians, they must wait for 1 Violinist and 2 Violists.
    - If a Violist arrives with no other musicians, they must wait for 1 Violinist, 1 Cellist, and 1 more Violist.
- The sequence of musicians entering should be divided into valid groups of `(V, C, A, A)` in any order within the group.

## Example 1
plaintext Input: musicians = "VCAA" Output: "VCAA" Explanation: All permutations like "VCAA", "AVCA", "AACV" are valid.

## Example 2
plaintext Input: musicians = "VVCAACAAVCA" Output: "VCAAVCAAVCA" Explanation: "CAVACAVCAAV", "VCAACAVACAV" are also valid answers.

## Task

Implement the `QuartetCoordinator` class:

- `QuartetCoordinator()` Initializes the object.
- `void violinist(Runnable playViolin)` The Violinist thread will call this method to enter the rehearsal room.
- `void cellist(Runnable playCello)` The Cellist thread will call this method to enter the rehearsal room.
- `void violist(Runnable playViola)` The Violist thread will call this method to enter the rehearsal room.