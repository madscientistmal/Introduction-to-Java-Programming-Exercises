/*
 * Chapter 1 - Exercise 1.12
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 */

public class Exercise1_12 {
	public static void main(String[] args) {
		System.out.println("The average speed of a runner that runs 24 miles in 1 hour, 40 minutes, and 35 seconds is " + 
		 (24 * 1.6) / (6035.0/3600.0)  + " kilometers per hour.");
	}
}