# Concurrency Problems - Print RGB Sequence

You have an object `printColor`. `printColor.accept(x)` can be called with a character parameter that prints it to the console.

You are given an instance of the class `RGBSequence` that has three functions: `red()`, `green()`, and `blue()`. The same instance of `RGBSequence` will be passed to three different threads:
- **Thread A**: calls `red()` that should output `'R'`.
- **Thread B**: calls `green()` that should output `'G'`.
- **Thread C**: calls `blue()` that should output `'B'`.

Modify the given class to output the series `"RGBRGBRGB…"` where the length of the series must be `3 * n`.

---

## Implementation Details

Implement the `RGBSequence` class with the following functions:

- `RGBSequence(int n)`  
  Initializes the object with the number `n` that represents the number of complete `RGB` sequences that should be printed.

- `void red(printColor)`  
  Calls `printColor` to output `'R'`.

- `void green(printColor)`  
  Calls `printColor` to output `'G'`.

- `void blue(printColor)`  
  Calls `printColor` to output `'B'`.

---

## Constraints
- `1 <= n <= 100`

---

## Example Usage
```python
# For n = 1, expected output: "RGB"
# For n = 3, expected output: "RGBRGBRGB"