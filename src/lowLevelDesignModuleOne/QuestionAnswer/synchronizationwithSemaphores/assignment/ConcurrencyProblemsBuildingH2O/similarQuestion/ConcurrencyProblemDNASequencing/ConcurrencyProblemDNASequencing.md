# Concurrency Problem - DNA Sequencing

## Problem Statement

In a DNA sequencing lab, there are three types of nucleotides: `Adenine (A)`, `Thymine (T)`, and `Guanine (G)`. Your goal is to coordinate the sequencing of these nucleotides to form valid DNA strands.

- **Threads involved:** `adenine`, `thymine`, and `guanine`.
- **Synchronization point:** A sequencing station where each thread must wait until a complete DNA segment (4 nucleotides: 1 Adenine + 2 Thymine + 1 Guanine) can be formed.
- **Methods available:** `sequenceAdenine()`, `sequenceThymine()`, and `sequenceGuanine()` which allow threads to enter the sequencing station.

### Constraints:
- Nucleotides should be sequenced in groups of four: one Adenine, two Thymine, and one Guanine, combined immediately to form a DNA segment.
- All nucleotides of one DNA segment must be sequenced before the next segment's sequencing begins.
- Arrival conditions:
    - If an Adenine nucleotide arrives with no other nucleotides, it must wait for 2 Thymine and 1 Guanine nucleotides.
    - If a Thymine nucleotide arrives with no other nucleotides, it must wait for 1 Adenine, 1 Thymine, and 1 Guanine nucleotide.
    - If a Guanine nucleotide arrives with no other nucleotides, it must wait for 1 Adenine and 2 Thymine nucleotides.
- The sequence of nucleotides should be divided into valid groups of `(A, T, T, G)` in any order.

## Example 1
plaintext Input: nucleotides = "ATTG" Output: "ATTG" Explanation: All permutations like "ATTG", "TAGT", "TGAT" are valid.

## Example 2
plaintext Input: nucleotides = "AATTTTGG" Output: "ATTGATTG" Explanation: "ATTGATTG", "TTAGATTG", "ATTGTTAG" are also valid answers.

## Task

Implement the `DNASequencer` class:

- `DNASequencer()` Initializes the object.
- `void adenine(Runnable sequenceAdenine)` The Adenine thread will call this method to enter the sequencing station.
- `void thymine(Runnable sequenceThymine)` The Thymine thread will call this method to enter the sequencing station.
- `void guanine(Runnable sequenceGuanine)` The Guanine thread will call this method to enter the sequencing station.