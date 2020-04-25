/*
 * Chapter 2 - Exercise 2.21
 * ((Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 *  the future investment value using the following formula:
 * 
 * 			futureInvestmentValue =
 *            investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * 
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of
 * years 1, the future investment value is 1032.98.
 * 
 * Here is a sample run:
 * 
 * Enter investment amount: 1000
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $1043.34
 */
import java.util.*;
import java.lang.Math; 

public class Exercise2_21 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double invAmount, aInterestRate, mInterestRate, numberOfYears, futureValue = 0.0;
		
		System.out.println("This program calculates the future value of an investment.");
		System.out.print("Enter investment amount: ");
		invAmount = stdin.nextDouble();
	    System.out.print("Enter annual interest rate in percentage: ");
		aInterestRate = stdin.nextDouble();
		System.out.print("Enter number of years: ");
		numberOfYears = stdin.nextDouble();
		
		aInterestRate =  aInterestRate / 100;
		mInterestRate = aInterestRate / 12;
		futureValue = invAmount * Math.pow((1 + mInterestRate),(numberOfYears*12));
		
		System.out.print("\nAccumulated value is $" + futureValue);
	
	}
}