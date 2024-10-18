# Palindrome-Number

# PalindromeNumber Class

This Java program checks whether a given integer is a palindrome. A palindrome is a number that remains the same when its digits are reversed.

## Code Explanation

1. **Initialization**:
   - The variable `num` is initialized with a value (e.g., `121`).
   - `dup` stores the original number for comparison.
   - `rev` is used to build the reversed number.

2. **Reversal Logic**:
   - The program extracts each digit from `num` using the modulus operator `%` and builds the reversed number `rev`:
     - It calculates the last digit (`rem`) and appends it to `rev`.
     - It removes the last digit from `num` by performing integer division.

3. **Palindrome Check**:
   - After constructing `rev`, the program compares it to `dup`.
   - If they are equal, it prints that the number is a palindrome; otherwise, it displays the reversed number.

## Example
For `num = 121`, the output will be:
```
The given number is 121 Palindrome number.
```

This simple implementation serves as a foundational example of working with integers and control structures in Java.
