# Concurrency Problem - Nuclear Reactor Control

## Problem Statement

In a nuclear power plant, there's a critical control system that requires precise coordination of three types of control rods: `Boron (B)`, `Cadmium (C)`, and `Gadolinium (G)`. Your goal is to implement a system that ensures the correct sequence of rod insertions for safe reactor operation.

- **Threads involved:** `boron`, `cadmium`, and `gadolinium`.
- **Synchronization point:** The reactor core where each thread must wait until a complete control sequence (1 Boron + 2 Cadmium + 1 Gadolinium) can be performed.
- **Methods available:** `insertBoron()`, `insertCadmium()`, and `insertGadolinium()` which allow threads to participate in the control sequence.

### Constraints:
- Control rods should be inserted in groups of four: one Boron, two Cadmium, and one Gadolinium, completing the sequence immediately once the group is formed.
- All rods of one sequence must be inserted before the next sequence begins.
- Arrival conditions:
    - If a Boron rod arrives with no other rods, it must wait for 2 Cadmium and 1 Gadolinium rod.
    - If a Cadmium rod arrives with no other rods, it must wait for 1 Boron, 1 Cadmium, and 1 Gadolinium rod.
    - If a Gadolinium rod arrives with no other rods, it must wait for 1 Boron and 2 Cadmium rods.
- The sequence of rod insertions should be divided into valid groups of `(B, C, C, G)` in any order within the group.

## Example 1
plaintext Input: rods = "BCCG" Output: "BCCG" Explanation: All permutations like "BCCG", "CBCG", "CGBC" are valid.

## Example 2
plaintext Input: rods = "BBCCCCGGBCCG" Output: "BCCGBCCGBCCG" Explanation: "CGBCCGBCCGBC", "BCCGCGBCCGBC" are also valid answers.

## Task

Implement the `ReactorControl` class:

- `ReactorControl()` Initializes the object.
- `void boron(Runnable insertBoron)` The Boron thread will call this method to insert a Boron rod.
- `void cadmium(Runnable insertCadmium)` The Cadmium thread will call this method to insert a Cadmium rod.
- `void gadolinium(Runnable insertGadolinium)` The Gadolinium thread will call this method to insert a Gadolinium rod.