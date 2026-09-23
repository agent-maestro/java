// Exercise 8: Shorthand Assignment Operators

// Create Ex08.java. Start with a variable set to 100 points, then change its value four times using the shorthand operators. Print the value after each change.

// REQUIREMENTS

// Declare int points = 100; and print it with the label "Starting points: "
// Add 50 using += and print the result.
// Subtract 20 using -= and print the result.
// Double it using *= and print the result.
// Add one more using ++ and print the result.
// EXPECTED OUTPUT

// Starting points: 100

// After += 50: 150

// After -= 20: 130

// After *= 2: 260

// After ++: 261

public class Ex08 {
    public static void main(String[] args) {
        int points = 100;

        System.out.println("Starting points: " + points);

        points += 50; 

        System.out.println("After += 50: " + points);

        points -= 20;

        System.out.println("After -= 20: " + points);

        points *= 2;

        System.out.println("After *= 2: " + points);

        ++points;

        System.out.println("After ++: " + points);

    }
}
