
# Find Substring Index in Java

## Problem Statement

Implement the `strStr()` function that returns the **index of the first occurrence** of a string `needle` in another string `haystack`.  
If `needle` is **not** part of `haystack`, return `-1`.

You should **not use built-in functions** like `indexOf()` or `substring()`.



##  Example

### Input


haystack = "sadbutsad"
needle = "sad"


###  Output

0



##  Approach: Sliding Window

- Run a loop from `i = 0` to `haystack.length() - needle.length()`
- At every index `i`, compare `haystack.charAt(i + j)` with `needle.charAt(j)`
- If all characters match for one full pass (`j == needle.length()`), return that index


## ⏱️ Time & Space Complexity

* **Time Complexity:** O(n × m)
  (where `n = haystack.length()` and `m = needle.length()`)
* **Space Complexity:** O(1)



##  Author

Elisha 
