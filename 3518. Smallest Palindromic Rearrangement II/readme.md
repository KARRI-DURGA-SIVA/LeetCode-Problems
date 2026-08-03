# 3518. Smallest Palindromic Rearrangement II

## Problem Statement

You are given a **palindromic string** `s` and an integer `k`.

Your task is to find the **k-th lexicographically smallest palindromic permutation** of `s`.

If there are fewer than `k` distinct palindromic permutations, return an **empty string**.

> **Note:** Different rearrangements that produce the same palindrome are counted only once.

---

## Example 1

### Input

```text
s = "abba"
k = 2
```

### Output

```text
"baab"
```

### Explanation

The distinct palindromic rearrangements are:

```text
abba
baab
```

Lexicographical order:

```text
1. abba
2. baab
```

Since `k = 2`, the answer is:

```text
baab
```

---

## Example 2

### Input

```text
s = "aa"
k = 2
```

### Output

```text
""
```

### Explanation

There is only one distinct palindromic rearrangement:

```text
aa
```

Since `k = 2` exceeds the number of possible palindromes, return an empty string.

---

## Example 3

### Input

```text
s = "bacab"
k = 1
```

### Output

```text
"abcba"
```

### Explanation

The distinct palindromic rearrangements are:

```text
abcba
bacab
```

Lexicographical order:

```text
1. abcba
2. bacab
```

Since `k = 1`, the answer is:

```text
abcba
```

---

## Constraints

```text
1 <= s.length <= 10^4
s consists of lowercase English letters.
s is guaranteed to be palindromic.
1 <= k <= 10^6
```