/*
 * Chapter 2 - Exercise 2.25
 * (Financial application: payroll) Write a program that reads the following information
 * mation and prints a payroll statement:
 * 
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 6.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * 
 * Enter employee's name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 6.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 *
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $6.75
 * Gross Pay: $67.5
 * Deductions:
 *   Federal Withholding (20.0%): $13.5
 *	 State Withholding (9.0%): $6.07
 *   Total Deduction: $19.57
 * Net Pay: $47.92
 *
 */

import java.util.*;

public class Exercise2_25 {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		String emplName;
		double num0fHours, grossPay, totalDed, hrPayRate, fedRate, fedWith, stateRate, stateWith, netPay;
		
		System.out.print("Enter employee's name: ");
		emplName = stdin.next();
		System.out.print("Enter number of hours worked in a week: ");
		num0fHours = stdin.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		hrPayRate = stdin.nextDouble();
		System.out.print("Enter federal tax withholding rate (as a decimal): ");
		fedRate = stdin.nextDouble();
		System.out.print("Enter state tax withholding rate (as a decimal): ");
		stateRate = stdin.nextDouble();
		
		grossPay = hrPayRate * num0fHours;
		fedWith = fedRate * grossPay;
		stateWith = stateRate * grossPay;
		totalDed =  fedWith + stateWith;
		netPay = grossPay - totalDed;
		
		System.out.println("\nEmployee Name: " + emplName);
		System.out.println("Hours Worked: " + num0fHours);
		System.out.println("Pay Rate: $" + hrPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + (fedRate * 100) + "%): $" + fedWith);
		System.out.println("  State Withholding (" + (stateRate * 100) + "%): $" + stateWith);
		System.out.println("  Total Deduction: $" + totalDed);
		System.out.println("Net Pay: $" + netPay);
		
	}	
}
		
		