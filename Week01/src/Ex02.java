// Exercise 2: Declaring Variables

// Create Ex02.java. Declare one variable for each data type below, assign it an appropriate value, and print each one on a separate line with a label.

// REQUIREMENTS

// String firstName (your first name)
// String city (the city where you live)
// int yearsOfExperience (a whole number)
// double hoursPerWeek (a number with a decimal point)
// boolean isEnrolled (true or false)
// char firstInitial (a single letter in single quotes, e.g., 'M')
// Each line of output must include a label (e.g., First name: Maria).
// EXPECTED OUTPUT

// First name: Maria

// City: SeaTac

// Years of experience: 0

// Hours per week: 18.0

// Enrolled: true

// First initial: M

// (your own values should appear here)

public class Ex02 {
    public static void main(String[] args) {
        String firstName = "Arturo";
        String city = "puyallup";
        int yearsOfExperience = 0;
        double hoursPerWeek = 18;
        boolean enrolled = true;
        char firstInitial = 'A';

        System.out.println("First name: " + firstName);
        System.out.println("City : " + city);
        System.out.println("Years of Experience : " + yearsOfExperience);
        System.out.println("Hours per week: " + hoursPerWeek);
        System.out.println("Enrolled: " + enrolled);
        System.out.println("First Initial: " + firstInitial);
    }
}
