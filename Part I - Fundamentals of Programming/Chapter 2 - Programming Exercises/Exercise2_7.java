/*
 * Chapter 2 - Exercise 2.7
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the
 * minutes. For simplicity, assume a year has 365 days. Here is a sample run:
 *
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */
 
import java.util.Scanner;

public class Exercise2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int minutes, days, remainingDays, years;

		System.out.print("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		days = minutes / 60 / 24;
		years = days / 365;
		
		remainingDays = days - (years * 365);

		System.out.print(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
	}
}
