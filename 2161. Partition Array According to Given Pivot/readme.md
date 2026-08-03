# 2161. Partition Array According to Given Pivot

## Problem Statement

You are given a **0-indexed** integer array `nums` and an integer `pivot`.

Rearrange the array such that:

- Every element **less than** `pivot` appears before every element **greater than** `pivot`.
- Every element **equal to** `pivot` appears between the smaller and greater elements.
- The **relative order** of elements less than `pivot` and greater than `pivot` must remain unchanged.

Return the rearranged array.

---

## Example 1

### Input

```text
nums = [9,12,5,10,14,3,10]
pivot = 10
```

### Output

```text
[9,5,3,10,10,12,14]
```

### Explanation

- Elements less than `10` are: `[9,5,3]`
- Elements equal to `10` are: `[10,10]`
- Elements greater than `10` are: `[12,14]`

After rearranging while maintaining the relative order:

```text
[9,5,3,10,10,12,14]
```

---

## Example 2

### Input

```text
nums = [-3,4,3,2]
pivot = 2
```

### Output

```text
[-3,2,4,3]
```

### Explanation

- Elements less than `2` are: `[-3]`
- Elements equal to `2` are: `[2]`
- Elements greater than `2` are: `[4,3]`

The relative order of both groups remains unchanged.

---

## Constraints

```text
1 <= nums.length <= 10^5
-10^6 <= nums[i] <= 10^6
pivot is guaranteed to be an element of nums
```