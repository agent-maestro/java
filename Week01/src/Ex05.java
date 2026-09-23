// Exercise 5: Integer Division

// Create Ex05.java. Seven slices of pizza are shared by two people. Before running the program, write down on paper what you expect each of the four lines below to print. Then write and run the program, and compare the results with your prediction.

// REQUIREMENTS

// Declare int totalSlices = 7; and int people = 2;
// Print totalSlices / people with the label "Integer division: "
// Print totalSlices % people with the label "Remainder: "
// Print totalSlices / 2.0 with the label "Decimal division: "
// Print (double) totalSlices / people with the label "Decimal division with a cast: "
// At the bottom of your file, add a comment (one sentence) explaining why the first and third lines give different results.
// EXPECTED OUTPUT

// Integer division: 3

// Remainder: 1

// Decimal division: 3.5

// Decimal division with a cast: 3.5


public class Ex05 {
    public static void main(String[] args) {
        int totalSlices = 7;
        int people = 2;

        System.out.println("Integer Division: " + (totalSlices / people));
        System.out.println("Remainder: " + (totalSlices % people));
        System.out.println("Decimal division: " + (totalSlices / 2.0));
        System.out.println("Decimal division with a cast: " + ((double) totalSlices/ people));
    }
}

//The difference between line 1 and line 3 is that line one is divinding whole pizza slices againsts 2 people evenenly and like 3 is taking a whole slice and cutting it in half so 2 people get 1 half each 
