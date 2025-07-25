
# Score of String – Java Program

## 📝 Problem Statement

You are given a string `s`.  
The **score** of the string is defined as the **sum of the absolute differences between the ASCII values of adjacent characters** in the string.



##  Input

- A single string `s` (passed directly as a method parameter).
- Do **NOT** use `Scanner` to read input. The platform (like LeetCode) already provides the input.



##  Output

- Return an integer: the total score computed as per the logic.



##  Logic

Loop through the string from index `0` to `s.length() - 2`.
For each adjacent character pair, calculate:

|ASCII(s.charAt(i)) - ASCII(s.charAt(i + 1))|




## 📌 Examples

### Example 1

**Input:** `"hello"`
**ASCII values:** `h=104, e=101, l=108, l=108, o=111`
**Score:** `|104-101| + |101-108| + |108-108| + |108-111| = 3 + 7 + 0 + 3 = 13`
**Output:** `13`

---

### Example 2

**Input:** `"zaz"`
**ASCII values:** `z=122, a=97`
**Score:** `|122-97| + |97-122| = 25 + 25 = 50`
**Output:** `50`

---


##  Author

**Kolipaka Elisa**
