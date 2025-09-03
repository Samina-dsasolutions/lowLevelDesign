# Concurrency Problems - Print Leader Follower Sequence

You have an object `printChar`. `printChar.accept(x)` can be called with a character parameter that prints it to the console.

You are given an instance of the class `LeaderFollowerSequence` that has three functions: `leader()`, `follower1()`, and `follower2()`. The same instance of `LeaderFollowerSequence` will be passed to three different threads:
- **Thread A**: calls `leader()` that should output `'L'`.
- **Thread B**: calls `follower1()` that should output `'F'`.
- **Thread C**: calls `follower2()` that should output `'f'`.

Modify the given class to output the series `"LFfLFfLFf…"` where the length of the series must be `3 * n`.

---

## Implementation Details

Implement the `LeaderFollowerSequence` class with the following functions:

- `LeaderFollowerSequence(int n)`  
  Initializes the object with the number `n` that represents the number of complete `LFf` sequences that should be printed.

- `void leader(printChar)`  
  Calls `printChar` to output `'L'`.

- `void follower1(printChar)`  
  Calls `printChar` to output `'F'`.

- `void follower2(printChar)`  
  Calls `printChar` to output `'f'`.

---

## Constraints
- `1 <= n <= 50`

---

## Example Usage
```python
# For n = 2, expected output: "LFfLFf"
# For n = 3, expected output: "LFfLFfLFf"