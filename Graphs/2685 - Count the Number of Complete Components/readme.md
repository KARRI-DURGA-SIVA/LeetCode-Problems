# LeetCode 2685 - Count the Number of Complete Components

## Problem Type
- Graph
- Depth-First Search (DFS)
- Breadth-First Search (BFS)
- Connected Components
- Graph Traversal

---

## Difficulty
**Medium**

---

## Problem Definition

You are given an undirected graph with `n` vertices numbered from `0` to `n - 1`.

A **connected component** is a group of vertices where every vertex can be reached from every other vertex in the same group.

A connected component is called **complete** if every pair of vertices in that component has an edge between them.

Return the number of complete connected components in the graph.

---

## Key Idea

1. Build the graph using an adjacency list.
2. Visit each connected component using DFS or BFS.
3. Count:
   - Number of vertices in the component.
   - Number of edges in the component.
4. A component is complete if

```
edges = vertices × (vertices - 1) / 2
```

If the condition is true, increase the answer.

---

## Example 1

### Input

```text
n = 6
edges = [[0,1],[0,2],[1,2],[3,4]]
```

### Output

```text
3
```

### Explanation

Component 1:
```
0 -- 1
 \  /
  2
```

Vertices = 3

Edges = 3

Complete ✅

Component 2:
```
3 -- 4
```

Vertices = 2

Edges = 1

Complete ✅

Component 3:
```
5
```

Single vertex is always complete ✅

Answer = **3**

---

## Example 2

### Input

```text
n = 6
edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
```

### Output

```text
1
```

### Explanation

Component 1

```
0 -- 1
 \  /
  2
```

Complete ✅

Component 2

```
4

 \
 3

 /
5
```

Missing edge between 4 and 5

Not Complete ❌

Answer = **1**

---

## Test Cases

### Test Case 1

```text
Input:
n = 1
edges = []

Output:
1
```

---

### Test Case 2

```text
Input:
n = 2
edges = []

Output:
2
```

---

### Test Case 3

```text
Input:
n = 2
edges = [[0,1]]

Output:
1
```

---

### Test Case 4

```text
Input:
n = 4
edges = [[0,1],[1,2]]

Output:
2
```

---

### Test Case 5

```text
Input:
n = 6
edges = [[0,1],[0,2],[1,2],[3,4]]

Output:
3
```

---

### Test Case 6

```text
Input:
n = 6
edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]

Output:
1
```

---

## Algorithm

1. Create an adjacency list.
2. Mark all vertices as unvisited.
3. Traverse every vertex.
4. If the vertex is not visited:
   - Perform DFS.
   - Count vertices.
   - Count edges.
5. Divide the edge count by 2 (each edge is counted twice).
6. Check

```
edges == vertices × (vertices - 1) / 2
```

7. If the condition is true, increment the complete-component count.

---

## Complexity

- **Time Complexity:** `O(n + e)`, where `e` is the number of edges.
- **Space Complexity:** `O(n + e)` for the adjacency list, visited array, and DFS recursion stack.

7. If true, increment the answer.
8. Return the answer.

---

## Time Complexity

```
O(V + E)
```

- `V` = Number of vertices
- `E` = Number of edges

Each vertex and edge is visited only once.

---

## Space Complexity

```
O(V + E)
```

- Adjacency list uses `O(V + E)`
- Visited array uses `O(V)`
- DFS recursion stack uses `O(V)` in the worst case.

---

## Concepts Used

- Graph
- Adjacency List
- DFS
- BFS
- Connected Components
- Graph Traversal
- Complete Graph

---

## Formula

For a component with **V** vertices,

```
Maximum possible edges

= V × (V - 1) / 2
```

If

```
Actual Edges == V × (V - 1) / 2
```

then the connected component is a **Complete Graph**.
