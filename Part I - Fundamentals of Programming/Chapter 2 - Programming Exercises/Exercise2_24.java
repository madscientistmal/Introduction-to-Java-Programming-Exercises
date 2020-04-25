/*
 * Chapter 2 - Exercise 2.24
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when converting a
 * double value to an int value. Enter the input as an integer whose last two digits
 * represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */
import java.util.*;

public class Exercise2_24 {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter an amount as an integer whose last two digits represent the cents. \n(For example, the input 1156 represents 11 dollars and 56 cents): ");
		int amount = stdin.nextInt();
		
		int remainingAmount = amount;
		
		int numberOfCents = remainingAmount % 100;
		int numberOfOneDollars = amount - numberOfCents;
		
		// Find the number of dollars in the remaining amount
		numberOfOneDollars = numberOfOneDollars / 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = numberOfCents / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount; 

        // Display results
		System.out.println("Your amount " + amount + " consists of \n" +
		"\t" + numberOfOneDollars + " dollars\n" +
		"\t" + numberOfQuarters + " quarters\n" +
		"\t" + numberOfDimes + " dimes\n" +
		"\t" + numberOfNickels + " nickels\n" +
		"\t" + numberOfPennies + " pennies");
	
	}	
}