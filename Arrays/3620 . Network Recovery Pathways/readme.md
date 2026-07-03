# Find Maximum Path Score

## Difficulty
**Hard**

## Problem
Given a Directed Acyclic Graph (DAG), find a valid path from node `0` to node `n-1` such that:
- All intermediate nodes are online.
- Total path cost ≤ `k`.
- The answer is the **maximum possible minimum edge cost** on the path.

Return `-1` if no valid path exists.

---

## Test Cases

### Example 1

**Input**
```text
edges = [[0,1,5],[1,3,10],[0,2,3],[2,3,4]]
online = [true,true,true,true]
k = 10
```

**Output**
```text
3
```

---

### Example 2

**Input**
```text
edges = [[0,1,7],[1,4,5],[0,2,6],[2,3,6],[3,4,2],[2,4,6]]
online = [true,true,true,false,true]
k = 12
```

**Output**
```text
6
```

---

## Pattern Used
- Binary Search on Answer
- Topological Sort (Kahn's Algorithm)
- Dynamic Programming on DAG

---

## Time Complexity
```text
O((N + M) × log M)
```

## Space Complexity
```text
O(N + M)
```