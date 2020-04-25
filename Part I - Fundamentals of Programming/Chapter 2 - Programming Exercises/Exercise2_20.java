/*
 * Chapter 2 - Exercise 2.20
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly payment
 * using the following formula:
 * 
 * 			interest = balance * (annualInterestRate / 1200)
 * 
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month. Here is a sample run:
 *
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 */
import java.util.*;
import java.lang.Math; 

public class Exercise2_20 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double interest, balance, interestRate = 0.0;
		
		System.out.println("This program calculates the interest on the next monthly payment.");
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = stdin.nextDouble();
	    interestRate = stdin.nextDouble();
		
		interest = balance * (interestRate / 1200);
		
		System.out.print("\nTThe interest is " + interest);
	
	}
}