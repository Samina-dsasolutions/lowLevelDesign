# Concurrency Problem - Molecule Assembly

## Problem Statement

In a chemical laboratory, scientists are working on assembling complex molecules. There are three types of atoms: `Carbon (C)`, `Hydrogen (H)`, and `Oxygen (O)`. Your goal is to coordinate the assembly of these atoms to form a specific molecule: CH₃OH (Methanol).

- **Threads involved:** `carbon`, `hydrogen`, and `oxygen`.
- **Synchronization point:** A reaction chamber where each thread must wait until a complete Methanol molecule (6 atoms: 1 Carbon + 4 Hydrogen + 1 Oxygen) can be formed.
- **Methods available:** `bondCarbon()`, `bondHydrogen()`, and `bondOxygen()` which allow threads to enter the reaction chamber.

### Constraints:
- Atoms should be assembled in groups of six: one Carbon, four Hydrogen, and one Oxygen, combined immediately to form a Methanol molecule.
- All atoms of one Methanol molecule must be bonded before the next molecule's assembly begins.
- Arrival conditions:
    - If a Carbon atom arrives with no other atoms, it must wait for 4 Hydrogen and 1 Oxygen atom.
    - If a Hydrogen atom arrives with no other atoms, it must wait for 1 Carbon, 3 Hydrogen, and 1 Oxygen atom.
    - If an Oxygen atom arrives with no other atoms, it must wait for 1 Carbon and 4 Hydrogen atoms.
- The sequence of atoms should be divided into valid groups of `(C, H, H, H, H, O)` in any order.

## Example 1
plaintext Input: atoms = "CHHHHO" Output: "CHHHHO" Explanation: All permutations like "CHHHHO", "HCHHHO", "HHHCHO" are valid.

## Example 2
plaintext 
```
Input: atoms = "CHHHHOCHHHHOCHHH" Output: "CHHHHOHHHHOCHHHO" 
Explanation: "CHHHHOHHHHOCHHHO", "HHHCHOHHHCHOHHHCO" are also valid answers.
```
## Task

Implement the `MoleculeAssembler` class:

- `MoleculeAssembler()` Initializes the object.
- `void carbon(Runnable bondCarbon)` The Carbon thread will call this method to enter the reaction chamber.
- `void hydrogen(Runnable bondHydrogen)` The Hydrogen thread will call this method to enter the reaction chamber.
- `void oxygen(Runnable bondOxygen)` The Oxygen thread will call this method to enter the reaction chamber.