// Exercise 6: Computing an Average

// Create Ex06.java. Declare three double variables with the values 90.0, 85.0, and 95.0. Compute their total and average, then print both.

// REQUIREMENTS

// Store the three scores in three separate double variables.
// Store the sum of the three scores in a variable named total.
// Compute the average by dividing total by 3, and store it in a variable named average.
// Print the total and the average on two labelled lines.
// EXPECTED OUTPUT

// Total: 270.0

// Average: 90.0

public class Ex06 {
    public static void main(String[] args) {
        double a = 90.0;
        double b = 85.0;
        double c = 95.0;

        double total = a + b + c; 
        double average = total / 3; 

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
