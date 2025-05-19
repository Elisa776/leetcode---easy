# Roman to Integer Converter

This Java program converts a Roman numeral string to its integer equivalent.

## Description

The program reads a Roman numeral input from the user and converts it into an integer using the rules of Roman numerals. It supports the standard symbols: I, V, X, L, C, D, and M.

## How it works

- A map stores the integer values for each Roman numeral character.
- The program iterates through the input string.
- If the current numeral is less than the next one, it subtracts its value.
- Otherwise, it adds its value.
- Finally, the total integer value is returned.

## How to run

1. Clone or download the repository.  
2. Compile the Java files:  

   javac Main.java Solution.java


3. Run the program:

   java Main

4. Enter a Roman numeral (e.g., `XIV`) and press Enter.
5. The program outputs the corresponding integer (e.g., `14`).

## Example

Input:  XIV
Output: 14


## Author

Elisa

