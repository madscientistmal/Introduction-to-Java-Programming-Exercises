/*
 * Chapter 2 - Exercise 2.12
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * 
 * 					length = (v^2 / 2a)
 *           
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s^2) and displays the minimum runway
 * length. Here is a sample run:
 *
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 */
import java.util.*;

public class Exercise2_12 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double runwayLength, speed, acceleration = 0.0;
		
		System.out.print("Enter speed and acceleration: ");
		speed = stdin.nextDouble();
		acceleration = stdin.nextDouble();
		
		
		runwayLength = ( (speed * speed) / (2 * acceleration));
		
		System.out.println("The minimum runway length for this airplane is " + runwayLength);
	
	}
}