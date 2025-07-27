 Problem: Final Value of Variable After Performing Operations

You are given an array of strings `operations` containing operations with a variable `X`, where:

* `"++X"` and `"X++"` **increment** the value of `X` by `1`
* `"--X"` and `"X--"` **decrement** the value of `X` by `1`

Initially, `X = 0`. Return the final value of `X` after performing all the operations.

##  Example

###  Input

```
["--X", "X++", "X++"]
```

###  Output

```
1
```

###  Explanation

* `"--X"` → X becomes -1
* `"X++"` → X becomes 0
* `"X++"` → X becomes 1
* Final value of `X` is `1`



## Another Test Case

### Input:

```
["++X", "++X", "--X", "X++"]
```

### Output:

```
2
```



## Time & Space Complexity

* **Time Complexity**: O(n), where n is the number of operations.
* **Space Complexity**: O(1), constant space.


**Author**

Elisha
