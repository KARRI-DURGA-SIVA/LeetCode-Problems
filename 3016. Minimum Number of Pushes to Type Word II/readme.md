# 3016. Minimum Number of Pushes to Type Word II

## Problem Statement

You are given a string `word` consisting of lowercase English letters.

A telephone keypad contains keys numbered **2 to 9**, and each key can be mapped to a distinct collection of lowercase letters.

For example:

- The first letter mapped to a key requires **1 push**.
- The second letter mapped to the same key requires **2 pushes**.
- The third letter requires **3 pushes**, and so on.

You are allowed to **remap** the letters to the keys in any way you want, with the following conditions:

- Each letter must be mapped to **exactly one key**.
- A key can contain **any number of letters**.
- Different keys must contain **distinct sets of letters**.

Return the **minimum number of key presses** required to type the given word after choosing the best possible mapping.

---

## Example 1

### Input

```text
word = "abcde"
```

### Output

```text
5
```

### Explanation

One optimal mapping is:

```text
a → Key 2 (1 push)
b → Key 3 (1 push)
c → Key 4 (1 push)
d → Key 5 (1 push)
e → Key 6 (1 push)
```

Total pushes:

```text
1 + 1 + 1 + 1 + 1 = 5
```

---

## Example 2

### Input

```text
word = "xyzxyzxyzxyz"
```

### Output

```text
12
```

### Explanation

One optimal mapping is:

```text
x → Key 2 (1 push)
y → Key 3 (1 push)
z → Key 4 (1 push)
```

Each character appears four times.

Total pushes:

```text
4 + 4 + 4 = 12
```

---

## Example 3

### Input

```text
word = "aabbccddeeffgghhiiiiii"
```

### Output

```text
24
```

### Explanation

A possible optimal mapping is:

```text
a → 1 push
b → 1 push
c → 1 push
d → 1 push
e → 1 push
f → 1 push
g → 1 push
i → 1 push
h → 2 pushes
```

Since **'i'** appears most frequently, it is assigned to a position requiring only **one push**.

Total pushes = **24**.

---

## Constraints

```text
1 <= word.length <= 10^5
word consists of lowercase English letters.
```