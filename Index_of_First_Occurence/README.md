Sure ra 🔥, ikkada nee cheppina example `"sadbutsad"` and `"sad"` ni base chesi **complete README.md file** istunna, GitHub style lo:

---

## 📄 README.md

```markdown
# 🔍 strStr() – Find Substring Index in Java

## 🧠 Problem Statement

Implement the `strStr()` function that returns the **index of the first occurrence** of a string `needle` in another string `haystack`.  
If `needle` is **not** part of `haystack`, return `-1`.

You should **not use built-in functions** like `indexOf()` or `substring()`.

---

## ✅ Example

### 🔸 Input
```

haystack = "sadbutsad"
needle = "sad"

```

### 🔹 Output
```

0

````

### 🧾 Explanation

We are searching for `"sad"` in `"sadbutsad"`.

Loop through each character in `haystack`, take substrings of length `needle.length()` and compare:

| i | haystack[i to i+2] | needle | Match? |
|---|---------------------|--------|--------|
| 0 | `"sad"`             | `"sad"`| ✅ Yes – Return 0 |
| 1 | `"adb"`             | `"sad"`| ❌ No |
| 2 | `"dbu"`             | `"sad"`| ❌ No |
| 3 | `"but"`             | `"sad"`| ❌ No |
| 4 | `"uts"`             | `"sad"`| ❌ No |
| 5 | `"tsa"`             | `"sad"`| ❌ No |
| 6 | `"sad"`             | `"sad"`| ✅ Match, but we already returned 0 |

---

## 💡 Approach: Sliding Window

- Run a loop from `i = 0` to `haystack.length() - needle.length()`
- At every index `i`, compare `haystack.charAt(i + j)` with `needle.charAt(j)`
- If all characters match for one full pass (`j == needle.length()`), return that index

---

## 🧾 Java Code

```java
import java.util.Scanner;

class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= n1 - n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == n) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter haystack: ");
        String haystack = scanner.nextLine();

        System.out.print("Enter needle: ");
        String needle = scanner.nextLine();

        Solution sol = new Solution();
        int result = sol.strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result);
    }
}
````

---

## ⏱️ Time & Space Complexity

* **Time Complexity:** O(n × m)
  (where `n = haystack.length()` and `m = needle.length()`)
* **Space Complexity:** O(1)

---

## 👨‍💻 Author

Elisha – Java Learner & Problem Solver 🚀

```

---

Cheppu ra inka vere example kavala? like `"mississippi"` `"issip"` or `"abcd"` `"xyz"` — add cheyyadam easy.
```
