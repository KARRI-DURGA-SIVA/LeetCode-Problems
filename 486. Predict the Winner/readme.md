# 486. Predict the Winner

## Problem Statement

You are given an integer array `nums`.

Two players are playing a game with this array.

- Player 1 starts first.
- Both players take turns.
- On each turn, a player picks either the **first** or the **last** element of the array.
- The chosen number is added to the player's score.
- The selected element is removed from the array.
- The game continues until there are no elements left.
- Both players play **optimally**.

Return **`true`** if Player 1 can win the game.

> **Note:** If both players have the same score, Player 1 is still considered the winner.

---

## Example 1

### Input

```text
nums = [1,5,2]
```

### Output

```text
false
```

### Explanation

Initially, Player 1 can choose either **1** or **2**.

- If Player 1 picks **1**, Player 2 picks **5**.
- If Player 1 picks **2**, Player 2 also picks **5**.

Final scores:

```text
Player 1 = 3
Player 2 = 5
```

Therefore, Player 1 cannot win.

---

## Example 2

### Input

```text
nums = [1,5,233,7]
```

### Output

```text
true
```

### Explanation

- Player 1 picks **1**.
- Player 2 chooses either **5** or **7**.
- Player 1 then picks **233**.

Final scores:

```text
Player 1 = 234
Player 2 = 12
```

Therefore, Player 1 wins.

---

## Constraints

```text
1 <= nums.length <= 20
0 <= nums[i] <= 10^7
```