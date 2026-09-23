// Exercise 4: Arithmetic Operators

// Create Ex04.java. Declare two int variables, a = 17 and b = 5, then print the result of each of the five arithmetic operators using these values.

// REQUIREMENTS

// Use the values 17 and 5 so your output matches the expected output below.
// Print sum (+), difference (-), product (*), quotient (/), and remainder (%), each on a labelled line.
// Enclose each calculation in parentheses inside println, for example: "Sum: " + (a + b)
// EXPECTED OUTPUT

// Sum: 22

// Difference: 12

// Product: 85

// Quotient: 3

// Remainder: 2

public class Ex04 {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
