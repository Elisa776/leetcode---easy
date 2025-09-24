```
# Best Time to Buy and Sell Stock (LeetCode Problem 121)

## Problem Statement
You are given an array `prices` where `prices[i]` is the price of a given stock on the *i-th* day.  

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.  

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.  

---

### Example 1:
**Input:**
```

prices = \[7,1,5,3,6,4]

```

**Output:**
```

5

```

**Explanation:**  
Buy on day 2 (price = 1) and sell on day 5 (price = 6).  
Profit = 6 - 1 = 5.  

---

### Example 2:
**Input:**
```

prices = \[7,6,4,3,1]

```

**Output:**
```

0

```

**Explanation:**  
No transactions can be done, so the profit is 0.  

---

## Constraints
- `1 <= prices.length <= 10^5`  
- `0 <= prices[i] <= 10^4`  

---

## Approach
- Keep track of the **minimum price so far** while iterating.  
- For each day, calculate the **profit if we sold today** (`prices[i] - min`).  
- Update the **maximum profit** if this profit is greater.  
- Return the maximum profit at the end.  

### Time Complexity:
- **O(n)** — single pass through the array.  

### Space Complexity:
- **O(1)** — constant extra space.  

---

## Author
**Elisa**
```


