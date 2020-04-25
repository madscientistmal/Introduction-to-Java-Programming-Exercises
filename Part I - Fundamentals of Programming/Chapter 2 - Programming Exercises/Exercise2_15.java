/*
 * Chapter 2 - Exercise 2.15
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 * 
 * 					s = (side1 + side2 + side3)/2;
 * 					area = √s(s - side1)(s - side2)(s - side3)
 *
 * Here is a sample run:
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 */
import java.util.*;
import java.lang.Math; 

public class Exercise2_15 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); 
		double x1, y1, x2, y2, x3, y3, area, s, side1, side2, side3 = 0.0;
		
		System.out.print("Enter three points for a triangle: ");
		x1 = stdin.nextDouble();
		y1 = stdin.nextDouble();
		x2 = stdin.nextDouble();
		y2 = stdin.nextDouble();
		x3 = stdin.nextDouble();
		y3 = stdin.nextDouble();
		
		side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.print("The area of the triangle is " + area);
	
	}
}