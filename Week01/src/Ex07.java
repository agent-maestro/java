// Exercise 7: Type Casting and Conversion

// Create Ex07.java. Perform the three type conversions below and print the result of each.

// REQUIREMENTS

// Declare double exactScore = 87.9; then create int wholeScore by casting it with (int). Print both.
// Declare int studentCount = 24; then assign it to a double variable. Print it.
// Declare char grade = 'A'; then assign it to an int variable. Print both in one sentence.
// In a comment, answer the following: when 87.9 was cast to an int, was the value rounded or cut off?
// EXPECTED OUTPUT

// Exact score: 87.9

// After casting to int: 87

// Student count as a double: 24.0

// The character A is number 65

public class Ex07 {
    public static void main(String[] args) {
        double exactScore = 87.9;
        int wholeScore = (int) exactScore;

        System.out.println("Exact Score: " + exactScore);
        System.out.println("After casting to int: " + wholeScore);

        int studentCount = 24;
        double count = studentCount;

        System.out.println("Student count as a double: " + count);

        char grade = 'A';
        int x = grade; 

        System.out.println("The character " + grade + " is a number " + x);
    }
}

//After casting the score was cut off