# Concurrency Problems - Print Vowel Consonant Sequence

You have an object `printChar`. `printChar.accept(x)` can be called with a character parameter that prints it to the console.

You are given an instance of the class `VowelConsonantSequence` that has three functions: `vowel()`, `consonant()`, and `number()`. The same instance of `VowelConsonantSequence` will be passed to three different threads:
- **Thread A**: calls `vowel()` that should output vowels (`a`, `e`, `i`, `o`, `u`) in order.
- **Thread B**: calls `consonant()` that should output consonants (`b`, `c`, `d`, `f`, `g`) in order.
- **Thread C**: calls `number()` that should output numbers (`1`, `2`, `3`, `4`, `5`) in order.

Modify the given class to output the series `"a1b2c3d4e5"` where each vowel, consonant, and number appears exactly once.

---

## Implementation Details

Implement the `VowelConsonantSequence` class with the following functions:

- `VowelConsonantSequence()`  
  Initializes the object.

- `void vowel(printChar)`  
  Calls `printChar` to output vowels in order.

- `void consonant(printChar)`  
  Calls `printChar` to output consonants in order.

- `void number(printChar)`  
  Calls `printChar` to output numbers in order.

---

## Constraints
- The output should always be `"a1b2c3d4e5"`.

---

## Example Usage
```python
# Expected output: "a1b2c3d4e5"