# Concurrency Problem - Balanced Diet Meal Planner

## Problem Statement

A nutrition company is developing an automated meal planner that ensures a balanced diet. The planner needs to coordinate the selection of three types of food: `Protein (P)`, `Carbohydrate (C)`, and `Vegetable (V)`. Your goal is to implement a system that creates balanced meal plans.

- **Threads involved:** `protein`, `carbohydrate`, and `vegetable`.
- **Synchronization point:** The meal assembly area where each thread must wait until a complete meal (1 Protein + 1 Carbohydrate + 2 Vegetables) can be formed.
- **Methods available:** `addProtein()`, `addCarb()`, and `addVegetable()` which allow threads to contribute to the meal plan.

### Constraints:
- Foods should be assembled in groups of four: one Protein, one Carbohydrate, and two Vegetables, completing the meal immediately once the group is formed.
- All components of one meal must be assembled before the next meal's assembly begins.
- Arrival conditions:
    - If a Protein item arrives with no other items, it must wait for 1 Carbohydrate and 2 Vegetables.
    - If a Carbohydrate item arrives with no other items, it must wait for 1 Protein and 2 Vegetables.
    - If a Vegetable item arrives with no other items, it must wait for 1 Protein, 1 Carbohydrate, and 1 more Vegetable.
- The sequence of food items should be divided into valid groups of `(P, C, V, V)` in any order within the group.

## Example 1
plaintext Input: foods = "PCVV" Output: "PCVV" Explanation: All permutations like "PCVV", "PVCV", "VPVC" are valid.

## Example 2
plaintext Input: foods = "PPCCVVVVPCVV" Output: "PCVVPCVVPCVV" Explanation: "VPCVVPCVPCVV", "PCVVVPCVPCVV" are also valid answers.

## Task

Implement the `MealPlanner` class:

- `MealPlanner()` Initializes the object.
- `void protein(Runnable addProtein)` The Protein thread will call this method to add a Protein item to the meal.
- `void carbohydrate(Runnable addCarb)` The Carbohydrate thread will call this method to add a Carbohydrate item to the meal.
- `void vegetable(Runnable addVegetable)` The Vegetable thread will call this method to add a Vegetable item to the meal.