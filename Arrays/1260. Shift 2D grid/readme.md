# 1260. Shift 2D Grid

## Difficulty
**Easy**

## Problem Statement

You are given an `m x n` 2D grid and an integer `k`.

Perform the grid shift operation `k` times.

In one shift:
- Each element moves one position to the right.
- The last element of a row moves to the first position of the next row.
- The last element of the last row moves to the first position of the first row.

Return the grid after performing `k` shifts.

---

## Example 1

**Input**
```text
grid = [[1,2,3],
        [4,5,6],
        [7,8,9]]
k = 1
```

**Output**
```text
[[9,1,2],
 [3,4,5],
 [6,7,8]]
```

---

## Example 2

**Input**
```text
grid = [[3,8,1,9],
        [19,7,2,5],
        [4,6,11,10],
        [12,0,21,13]]
k = 4
```

**Output**
```text
[[12,0,21,13],
 [3,8,1,9],
 [19,7,2,5],
 [4,6,11,10]]
```

---

## Example 3

**Input**
```text
grid = [[1,2,3],
        [4,5,6],
        [7,8,9]]
k = 9
```

**Output**
```text
[[1,2,3],
 [4,5,6],
 [7,8,9]]
```

---

## Constraints

- `m == grid.length`
- `n == grid[i].length`
- `1 <= m <= 50`
- `1 <= n <= 50`
- `-1000 <= grid[i][j] <= 1000`
- `0 <= k <= 100`

---

## Time Complexity

```text
O(m × n)
```

## Space Complexity

```text
O(m × n)
```