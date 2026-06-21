# Maximum Building Height

**Difficulty:** Hard  
**Topic:** Arrays, Sorting, Greedy

## Problem

You are given `n` buildings numbered from `1` to `n`. Building `1` must have height `0`, and the height difference between adjacent buildings cannot be more than `1`.

You are also given `restrictions`, where `restrictions[i] = [id, maxHeight]` means building `id` can have height at most `maxHeight`.

Return the maximum possible height of any building.

## Examples

### Example 1

```text
Input: n = 5, restrictions = [[2,1],[4,1]]
Output: 2
```

### Example 2

```text
Input: n = 6, restrictions = []
Output: 5
```

### Example 3

```text
Input: n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]
Output: 5
```

## Test Cases

```text
n = 5, restrictions = [[2,1],[4,1]]                 -> 2
n = 6, restrictions = []                            -> 5
n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]   -> 5
n = 2, restrictions = []                            -> 1
```

## Approach

1. Add the required boundary restrictions for building `1` and building `n`.
2. Sort all restrictions by building id.
3. Sweep left to right to reduce impossible height limits.
4. Sweep right to left to reduce limits again.
5. Check each gap between restricted buildings and calculate the tallest peak possible inside that gap.

## Complexity

```text
Time Complexity: O(r log r), where r is the number of restrictions
Space Complexity: O(r)
```
