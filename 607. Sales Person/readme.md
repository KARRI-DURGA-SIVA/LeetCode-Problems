# 607. Sales Person

## Problem Statement

You are given three tables:

- **SalesPerson** – Contains information about salespersons.
- **Company** – Contains company details.
- **Orders** – Contains information about customer orders.

Write an SQL query to find the names of all salespersons who **did not have any orders** with the company named **"RED"**.

Return the result table in **any order**.

---

## Example

### Input

### SalesPerson

| sales_id | name |
|----------|------|
| 1 | John |
| 2 | Amy |
| 3 | Mark |
| 4 | Pam |
| 5 | Alex |

### Company

| com_id | name |
|--------|------|
| 1 | RED |
| 2 | ORANGE |
| 3 | YELLOW |
| 4 | GREEN |

### Orders

| order_id | com_id | sales_id |
|----------|--------|----------|
| 1 | 3 | 4 |
| 2 | 4 | 5 |
| 3 | 1 | 1 |
| 4 | 1 | 4 |

---

### Output

| name |
|------|
| Amy |
| Mark |
| Alex |

---

## Approach

1. Find the `sales_id` of all salespersons who have orders with the company **RED**.
2. Exclude those `sales_id` values from the **SalesPerson** table.
3. Return the names of the remaining salespersons.

---

## SQL Query

```sql
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);
```

---

## Explanation

- Join the **Orders** and **Company** tables using `com_id`.
- Filter only the rows where the company name is **RED**.
- Retrieve the `sales_id` values of salespersons who sold to RED.
- Use `NOT IN` to exclude those salespersons.
- Return the names of the remaining salespersons.