// Exercise 9: Comparison Operators and Booleans

// Create Ex09.java. Declare int studentsEnrolled = 24; and int classCapacity = 30; along with a boolean variable, then print the answers to five true/false questions.

// REQUIREMENTS

// Also declare boolean hasLaptop = true;
// Print whether the class is full, using ==
// Print whether there are open seats, using <
// Print whether enrollment is different from capacity, using !=
// Print whether enrollment is at least 30, using >=
// Print the value of hasLaptop
// Each line must be written as a question (e.g., Is the class full? false).
// EXPECTED OUTPUT

// Is the class full? false

// Are there open seats? true

// Is enrollment different from capacity? true

// Is enrollment at least 30? false

// Do I have a laptop? true

public class Ex09 {
    public static void main(String[] args) {
        int studentsEnrolled = 24; 
        int classCapacity = 30;
        boolean classFull = studentsEnrolled == classCapacity;
        boolean openSeats = studentsEnrolled < classCapacity;
        boolean enrollmentDifferent = studentsEnrolled != classCapacity;
        boolean enrollment = studentsEnrolled >= 30;
        boolean hasLaptop = true;

        System.out.println("Is the class full? " + classFull);
        System.out.println("Are there open seats? " + openSeats);
        System.out.println("Is enrollment different from capacity? " + enrollmentDifferent);
        System.out.println("Is enrollment at least 30? " + enrollment);
        System.out.println("Do I have a laptop? " + hasLaptop);
    }
}
