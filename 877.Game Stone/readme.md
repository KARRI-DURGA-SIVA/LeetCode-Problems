# 877. Stone Game

## Problem Statement

Alice and Bob are playing a game with an even number of stone piles arranged in a row. Each pile contains a positive number of stones represented by `piles[i]`.

The rules of the game are:

- Alice and Bob take turns removing one entire pile.
- Alice always plays first.
- On each turn, a player can choose **either the first pile or the last pile**.
- The player who collects the most stones wins.
- The total number of stones is odd, so there will always be a winner.
- Both players play **optimally**.

Return **`true`** if Alice wins the game; otherwise, return **`false`**.

---

## Example 1

### Input

```text
piles = [5,3,4,5]
```

### Output

```text
true
```

### Explanation

- Alice picks the first pile (5).
- Remaining piles become `[3,4,5]`.
- Bob can pick either `3` or `5`.
- Regardless of Bob's move, Alice can always choose the better remaining pile and finish with more stones.

Hence, Alice wins.

---

## Example 2

### Input

```text
piles = [3,7,2,3]
```

### Output

```text
true
```

---

## Constraints

```text
2 <= piles.length <= 500
piles.length is even
1 <= piles[i] <= 500
sum(piles[i]) is odd
```