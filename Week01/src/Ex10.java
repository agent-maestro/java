// Exercise 10: Payment Plan Receipt

// Create Ex10.java. Write a program that prints a receipt for a Skillspire payment plan. This exercise does not introduce new concepts; it only uses what you practised in Exercises 1 to 9.

// REQUIREMENTS

// Declare String studentName and String programName.
// Declare double tuition = 6500.00; and double deposit = 500.00; and int numberOfPayments = 5;
// Calculate double balance as tuition minus deposit.
// Calculate double monthlyPayment as balance divided by numberOfPayments.
// Print the receipt exactly as shown in the expected output, including the lines of = and - characters.
// Do not hard-code the values 6000 or 1200 anywhere in your program. These must be computed by your code.
// EXPECTED OUTPUT

// ===== SKILLSPIRE PAYMENT PLAN =====

// Student: Maria Lopez

// Program: Java and Cloud Computing

// -----------------------------------

// Tuition: $6500.0

// Deposit paid: $500.0

// Balance due: $6000.0

// Payments: 5

// Monthly payment: $1200.0

// ===================================

// (your name should appear in place of Maria Lopez)

public class Ex10 {
    public static void main(String[] args) {
        String studentName = "Arturo Almaguer";
        String programName = "Java and Cloud Computing";

        double tuition = 6500.00;
        double deposit = 500.00;
        int numberOfPayments = 5;
        double balance = tuition - deposit;
        double monthlyPayment = balance / numberOfPayments;

        System.out.println("===== SKILLSPIRE PAYMENT PLAN =====");
        System.out.println("Student: " + studentName);
        System.out.println("Program: " + programName);
        System.out.println("-----------------------------------");
        System.out.println("Tuition: $" + tuition);
        System.out.println("Deposit paid: $" + deposit);
        System.out.println("Balance due: $" + balance);
        System.out.println("Payments: " + numberOfPayments);
        System.out.println("Monthly payment: $" + monthlyPayment);
        System.out.println("===================================");
    }
}
