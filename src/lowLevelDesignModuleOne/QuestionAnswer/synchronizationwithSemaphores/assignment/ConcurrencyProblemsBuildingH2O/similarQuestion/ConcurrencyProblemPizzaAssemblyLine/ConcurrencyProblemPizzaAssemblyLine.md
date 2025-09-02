# Concurrency Problem - Pizza Assembly Line

## Problem Statement

In a pizza restaurant, there's an automated pizza assembly line. There are three types of ingredients: `Dough (D)`, `Sauce (S)`, and `Cheese (C)`. Your goal is to coordinate the assembly of these ingredients to form complete pizzas.

- **Threads involved:** `dough`, `sauce`, and `cheese`.
- **Synchronization point:** An assembly station where each thread must wait until a complete pizza (4 components: 1 Dough + 1 Sauce + 2 Cheese) can be assembled.
- **Methods available:** `placeDough()`, `spreadSauce()`, and `sprinkleCheese()` which allow threads to enter the assembly station.

### Constraints:
- Ingredients should be assembled in groups of four: one Dough, one Sauce, and two Cheese, combined immediately to form a pizza.
- All ingredients of one pizza must be assembled before the next pizza's assembly begins.
- Arrival conditions:
    - If a Dough ingredient arrives with no other ingredients, it must wait for 1 Sauce and 2 Cheese ingredients.
    - If a Sauce ingredient arrives with no other ingredients, it must wait for 1 Dough and 2 Cheese ingredients.
    - If a Cheese ingredient arrives with no other ingredients, it must wait for 1 Dough, 1 Sauce, and 1 Cheese ingredient.
- The sequence of ingredients assembled should be divided into valid groups of `(D, S, C, C)` in any order.

## Example 1
plaintext 
```
Input: ingredients = "DSCC" Output: "DSCC" Explanation: All permutations like "DSCC", "SDCC", "DCSC" are valid.
```

## Example 2
plaintext 
```
Input: ingredients = "DSCCDSCCSCC" Output: "DSCCDSCCSCC" Explanation: "SDCCDSCCSCC", "DSCCSDCCCSC" are also valid answers.
```

## Task

Implement the `PizzaAssembler` class:

- `PizzaAssembler()` Initializes the object.
- `void dough(Runnable placeDough)` The Dough thread will call this method to enter the assembly station.
- `void sauce(Runnable spreadSauce)` The Sauce thread will call this method to enter the assembly station.
- `void cheese(Runnable sprinkleCheese)` The Cheese thread will call this method to enter the assembly station.