# Sum And Multiply

## Difficulty
**Medium**

## Definition

Given a string of digits and multiple queries, remove all `0`s from each queried substring, form a new number, calculate the sum of its digits, and return:

```
Number × Sum of Digits
```

Return the answer modulo **10^9 + 7**.

---

## Approach Used

- Prefix Sum
- Prefix Count
- Modular Arithmetic

---

## Test Cases

### Test Case 1

**Input**

```
s = "10203004"
queries = [[0,7],[1,3],[4,6]]
```

**Output**

```
[12340,4,9]
```

---

### Test Case 2

**Input**

```
s = "1000"
queries = [[0,3],[1,1]]
```

**Output**

```
[1,0]
```

---

### Test Case 3

**Input**

```
s = "9876543210"
queries = [[0,9]]
```

**Output**

```
[444444137]
```

---

## Time Complexity

```
O(n + q)
```

- `n` = Length of the string
- `q` = Number of queries

---

## Space Complexity

```
O(n)
```

---

## Language

- Java

---

## Author

**Karri Durga Siva**