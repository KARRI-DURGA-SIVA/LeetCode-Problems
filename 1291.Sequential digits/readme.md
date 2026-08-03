# Sequential Digits

## Problem
Given two integers `low` and `high`, return all sequential digit numbers in the range `[low, high]`.

A sequential digit number has digits that increase by **1** from left to right.

## Example
**Input:**
```text
low = 100
high = 300
```

**Output:**
```text
[123, 234]
```

## Approach
- Store `"123456789"` as a string.
- Generate all possible substrings.
- Convert each substring to an integer.
- If it is between `low` and `high`, add it to the answer.

## Time Complexity
**O(1)**

## Space Complexity
**O(1)** (excluding the output list)

## Topic
**String**