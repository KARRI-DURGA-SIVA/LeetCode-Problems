# Maximum Element After Decreasing and Rearranging

**Difficulty:** 🟠 Medium

---

## Problem

You are given an array of positive integers `arr`.

You may perform the following operations any number of times:

- Decrease the value of any element to a smaller positive integer.
- Rearrange the elements in any order.

After performing the operations, the array must satisfy:

- The first element must be `1`.
- The absolute difference between any two adjacent elements is at most `1`.

Return the **maximum possible value** of an element after performing the operations.

---

## Example 1

**Input**

```text
arr = [2,2,1,2,1]
```

**Output**

```text
2
```

**Explanation**

One possible arrangement is:

```text
[1,2,2,2,1]
```

The maximum element is **2**.

---

## Example 2

**Input**

```text
arr = [100,1,1000]
```

**Output**

```text
3
```

**Explanation**

After rearranging and decreasing:

```text
[1,2,3]
```

The maximum element is **3**.

---

## Example 3

**Input**

```text
arr = [1,2,3,4,5]
```

**Output**

```text
5
```

**Explanation**

The array already satisfies all the conditions.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `1 <= arr[i] <= 10^9`

---

## Approach

- Sort the array.
- Set the first element to `1`.
- Traverse the remaining elements.
- Update each element so it is at most **previous element + 1**.
- Return the last element.

---

## Test Cases

| Input | Output |
|--------|--------|
| `[2,2,1,2,1]` | `2` |
| `[100,1,1000]` | `3` |
| `[1,2,3,4,5]` | `5` |
| `[5]` | `1` |
| `[10,10,10]` | `3` |
| `[1,100,100,100]` | `4` |

---

## Complexity

| Complexity | Value |
|------------|-------|
| **Time Complexity** | **O(n log n)** |
| **Space Complexity** | **O(1)** |

---

## Pattern

- Sorting
- Greedy
- Array