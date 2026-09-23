// Exercise 3: Combining Strings

// Create Ex03.java. Declare three String variables and use the + operator to combine them into one sentence. Print the sentence using a single System.out.println statement.

// REQUIREMENTS

// Declare String firstName, String city, and String program.
// Use exactly one System.out.println for the sentence.
// The sentence must have proper spacing and end with a period.
// Be careful with spacing. The + operator joins text exactly as written and does not add spaces automatically.
// EXPECTED OUTPUT

// My name is Maria, I live in SeaTac, and I am studying Java and Cloud Computing.

public class Ex03 {
    public static void main(String[] args) {
        String firstName = "Arturo";
        String city = "Puyallup";
        String program = "Java and Cloud Computing.";

        System.out.println("My name is " + firstName + ", I live in " + city +", and I am sudying " + program);
    }
}
