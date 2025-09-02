# Concurrency Problem - Assembling Robots 
## Problem Statement 
In a robot assembly line, there are two types of components: `body` and `processor`. 
Your goal is to coordinate the assembly of these components to form complete robots. - 
**Threads involved:** 
`body` and `processor`. 
- **Synchronization point:** 
- An assembly station where each thread must wait until a complete robot (3 components: 1 body + 2 processors) can be assembled. 
- - **Methods available:** `attachProcessor()` and `attachBody()` which allow threads to enter the assembly station. 
- ### Constraints: 
- - Components should be assembled in groups of three: one body and two processors, combined immediately to form a robot. 
- - All components of one robot must be assembled before the next robot's assembly begins. 
- - Arrival conditions: 
- - If a body component arrives with no processor components, it must wait for 2 processor components. 
- - If a processor component arrives with no other components, it must wait for a body component and another processor component. 
- - The sequence of components assembled should be divided into valid groups of `(B, P, P)` where B is body and P is processor. 
- ## Example 1
plaintext Input: components = "BPB" Output: "PPB" Explanation: All permutations like "BPB" and "PBP" are valid.
## Example 2
plaintext Input: components = "PPBBBP" Output: "PPBPPB" Explanation: "BPPBPP", "PBPBPP", "PPBPBP", "BPPBPP", "PBPBPP", "PPBPPB" are also valid answers.
## Task 
Implement the `RobotAssembler` class: 
- `RobotAssembler()` Initializes the object. 
- - `void body(Runnable attachBody)` The body thread will call this method to enter the assembly station. 
- - `void processor(Runnable attachProcessor)` The processor thread will call this method to enter the assembly station.
