##  Most Words Found in a Sentence

###  Problem Statement:

You are given an array of strings called `sentences`, where each element represents a sentence.
Your task is to find the sentence that contains the **maximum number of words**, and return that count.


### Input:

* `sentences`: An array of strings, each string is a sentence with words separated by spaces.


### Output:

* An integer representing the **maximum number of words** in any single sentence.

### Example:

Input: ["I love you", "You are the best", "Java is fun"]
Output: 4
Explanation: The second sentence "You are the best" has 4 words, which is the maximum.


###  Time Complexity:

**O(n × m)**
  Where `n` is the number of sentences and `m` is the average number of words in a sentence (due to splitting).

### Space Complexity:

**O(1)** — Only a few variables used; space does not grow with input size significantly.


**Author**

Elisha

