/*
 * Chapter 1 - Exercise 1.8
 * (Area and perimeter of a circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formula:
 *
 *                     perimeter = 2 * radius * p
 *                     area = radius * radius * p
 * 
 */

public class Exercise1_8 {
	public static void main(String[] args) {
		System.out.println("The area of a circle with a radius of 5.5 is " + (5.5 * 5.5 * 3.14159));
		System.out.println("The perimeter of a circle with a radius of 5.5 is " + (2 * 5.5 * 3.14159));
	}
}