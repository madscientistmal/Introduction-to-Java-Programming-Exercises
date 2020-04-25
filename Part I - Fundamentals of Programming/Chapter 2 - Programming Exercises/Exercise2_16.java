/*
 * Chapter 2 - Exercise 2.16
 * ((Geometry: area of a hexagon) Write a program that prompts the user to enter the side
 * of a hexagon and displays its area. The formula for computing the area of a hexagon is
 * 
 * 					Area = ((3√3)/2)* s^2
 *
 * where s is the length of a side. Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 */
import java.util.*;
import java.lang.Math; 

public class Exercise2_16 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); 
		double hexSide, area = 0.0;
		
		System.out.print("Enter a side of a hexagon: ");
		hexSide = stdin.nextDouble();
		
		area = ((3 * Math.sqrt(3)) / 2 ) * Math.pow(hexSide, 2);
		
		System.out.print("The area of the hexagon is " + area);
	
	}
}