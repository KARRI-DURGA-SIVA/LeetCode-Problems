# Product of Array Except Self

**Difficulty:** Medium  
**Topic:** Arrays

## Problem

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all elements of `nums` except `nums[i]`.

The solution should run in `O(n)` time and should not use division.

## Examples

### Example 1

```text
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

### Example 2

```text
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

## Test Cases

```text
nums = [1,2,3,4]        -> [24,12,8,6]
nums = [-1,1,0,-3,3]   -> [0,0,9,0,0]
nums = [2,3]            -> [3,2]
nums = [0,0]            -> [0,0]
```

## Approach

1. Store prefix products in the result array.
2. Walk from right to left with a suffix product.
3. Multiply each prefix value by the suffix product to get the final answer.

## Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1) extra space, excluding the output array
```
