##  Jewels and Stones

###  Problem Statement:

You are given two strings:

* `jewels`: each character represents a type of jewel.
* `stones`: each character represents a stone you have.

You need to count how many stones are also jewels.


###  Input:

* `jewels`: A string of unique characters (types of jewels).
* `stones`: A string containing the stones you possess.


###  Output:

* An integer count of how many stones are jewels.


###  Example:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Explanation: Stones 'a' and 'A' are jewels. They appear 1 and 2 times respectively in stones.


### ⏱ Time Complexity:

* **O(n × m)** where `n` is length of `jewels`, and `m` is length of `stones`.

###  Space Complexity:

* **O(1)** — only a counter is used.

**Author**

Elisha
