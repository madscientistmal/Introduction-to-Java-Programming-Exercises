/*
 * Chapter 2 - Exercise 2.3
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 *
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters 
 *
 */
 
import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double numInFeet, numInMeters;
		
		System.out.print("Enter a value for feet: ");
		numInFeet = input.nextDouble();
		
		numInMeters = numInFeet * 0.305;
		
		System.out.print(numInFeet + " feet is " + numInMeters + " meters");
	}
}