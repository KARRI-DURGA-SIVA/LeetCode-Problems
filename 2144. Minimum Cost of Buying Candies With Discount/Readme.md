# 2144. Minimum Cost of Buying Candies With Discount

- **Difficulty:** Easy

---

## Problem Definition

A candy shop offers a special discount:

- For every **2 candies** you purchase, you can get **1 additional candy for free**.
- The free candy must have a price **less than or equal to** the cheaper of the two purchased candies.

Given an integer array `cost`, where `cost[i]` represents the price of the `iᵗʰ` candy, return the **minimum total cost** required to buy all the candies.

---

## Test Cases

### Test Case 1

**Input**
```text
cost = [1,2,3]
```

**Output**
```text
5
```

---

### Test Case 2

**Input**
```text
cost = [6,5,7,9,2,2]
```

**Output**
```text
23
```

---

### Test Case 3

**Input**
```text
cost = [5,5]
```

**Output**
```text
10
```

---

## Pattern Used

- Greedy
- Sorting

---

## Time Complexity

- **O(n log n)**

---

## Space Complexity

- **O(1)**