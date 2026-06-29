# Longest Consecutive Sequence

**Difficulty:** 🟠 Medium

---

## Problem

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in **O(n)** time.

---

## Example 1

**Input**

```text
nums = [100,4,200,1,3,2]
```

**Output**

```text
4
```

**Explanation**

The longest consecutive sequence is:

```text
[1,2,3,4]
```

Length = **4**

---

## Example 2

**Input**

```text
nums = [0,3,7,2,5,8,4,6,0,1]
```

**Output**

```text
9
```

---

## Example 3

**Input**

```text
nums = [1,0,1,2]
```

**Output**

```text
3
```

---

## Constraints

- `0 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

---

## Approach

- Store all numbers in a `HashSet`.
- Only start counting from numbers that do not have a previous consecutive number (`num - 1`).
- Continue checking `num + 1`, `num + 2`, ... until the sequence ends.
- Keep track of the maximum sequence length.

---

## Test Cases

| Input | Output |
|-------|--------|
| `[100,4,200,1,3,2]` | `4` |
| `[0,3,7,2,5,8,4,6,0,1]` | `9` |
| `[1,0,1,2]` | `3` |
| `[]` | `0` |
| `[5]` | `1` |
| `[1,2,3,4,5]` | `5` |

---

## Complexity

| Complexity | Value |
|------------|-------|
| Time | **O(n)** |
| Space | **O(n)** |

---

## Pattern

- HashSet
- Sequence Traversal
- Greedy