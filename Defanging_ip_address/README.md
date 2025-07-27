# Defanging an IP Address

## Problem
Given a valid IPv4 address, return a "defanged" version of that IP address.

A defanged IP address replaces every period `.` with `[.]`.

## Example

**Input:**
```

address = "1.1.1.1"

```

**Output:**
```

"1\[.]1\[.]1\[.]1"

```

## Explanation
Every `.` in the input string is replaced with `[.]` to prevent the address from being recognized as a real IP address by certain systems.

## Input Format
A string `address` representing a valid IPv4 address.

## Output Format
A string where each `.` in the address is replaced by `[.]`.

## Constraints
- The address is a valid IPv4 address.
- Length of the string: 7 to 15 characters.


**Author**
Elisha
