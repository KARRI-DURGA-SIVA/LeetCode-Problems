# 627. Swap Sex

## Problem Statement

Table: **Salary**

| Column | Type |
|--------|------|
| id | int |
| name | varchar |
| sex | ENUM('m','f') |
| salary | int |

The table contains information about employees.

Write a SQL query to **swap** all `'m'` values to `'f'` and all `'f'` values to `'m'`.

### Conditions

- Use **only one UPDATE statement**.
- Do **not** use any temporary table.
- Do **not** use any SELECT statement.

---

## Example

### Input

| id | name | sex | salary |
|----|------|-----|--------|
| 1 | A | m | 2500 |
| 2 | B | f | 1500 |
| 3 | C | m | 5500 |
| 4 | D | f | 500 |

---

### Output

| id | name | sex | salary |
|----|------|-----|--------|
| 1 | A | f | 2500 |
| 2 | B | m | 1500 |
| 3 | C | f | 5500 |
| 4 | D | m | 500 |

---

## Approach

- Update every row in the table.
- Use the **CASE** expression to check the current value of `sex`.
- If the value is `'m'`, change it to `'f'`.
- Otherwise, change it to `'m'`.

---

## SQL Query

```sql
UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;
```

---

## Explanation

- `UPDATE Salary` updates all rows in the **Salary** table.
- `CASE` works like an **if-else** statement.
- If `sex = 'm'`, it is changed to `'f'`.
- Otherwise (`'f'`), it is changed to `'m'`.
- The update happens in a **single SQL statement**, satisfying the problem requirements.