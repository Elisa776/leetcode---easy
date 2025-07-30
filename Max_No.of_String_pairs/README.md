# Maximum Number of String Pairs

Given an array of strings, count how many pairs `(i, j)` exist such that:

- `i < j`
- `words[i]` is equal to the **reverse** of `words[j]`

---

### Example:

**Input:**
`["cd", "ac", "dc", "ca", "zz"]`

**Output:**
2

**Explanation:**
- "cd" and "dc" are reverses → ✅
- "ac" and "ca" are reverses → ✅
- Total valid pairs = 2

---

###  Approach:

- Compare each word with the reversed form of every later word in the array.
- If any two are reverse of each other, count that pair.
- Make sure not to count the same pair twice by ensuring `i < j`.

---

###  Time Complexity:

- `O(n^2)` — because it checks every pair of strings in the list.

###  Space Complexity:

- `O(1)` — no extra space used except temporary reversed strings.

---

This problem helps strengthen string manipulation and pairwise comparison logic.

---

**Author**

Elisha
