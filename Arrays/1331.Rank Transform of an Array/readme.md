# Array Rank Transform

## Problem Type

* Array
* Sorting
* HashMap

## Difficulty

**Easy**

## Problem Definition

Given an integer array `arr`, replace each element with its rank.

Rules:

* Rank starts from **1**.
* Larger elements have larger ranks.
* Equal elements have the same rank.
* Ranks should be as small as possible.

## Approach

1. Copy the array.
2. Sort the copied array.
3. Assign ranks to unique elements using a `HashMap`.
4. Replace each element in the original array with its rank.

## Test Cases

**Input**

```text
[40,10,20,30]
```

**Output**

```text
[4,1,2,3]
```

**Input**

```text
[100,100,100]
```

**Output**

```text
[1,1,1]
```

**Input**

```text
[37,12,28,9,100,56,80,5,12]
```

**Output**

```text
[5,3,4,2,8,6,7,1,3]
```

## Time Complexity

* **O(n log n)**

## Space Complexity

* **O(n)**

## Concepts Used

* Array
* Sorting
* HashMap
* Rank Assignment
