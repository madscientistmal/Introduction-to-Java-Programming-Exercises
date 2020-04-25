/*
 * Chapter 1 - Exercise 1.10
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and
 * 30 seconds. Write a program that displays the average speed in miles per hour
 * (Note that 1 mile is 1.6 kilometers.)
 * 
 */

public class Exercise1_10 {
	public static void main(String[] args) {
		System.out.println("The average speed of a runner that runs 14 kilometers in 45 minutes and 30 seconds is " + 
		((14/1.6) / ((45.5/60))) + " miles per hour.");
	}
}