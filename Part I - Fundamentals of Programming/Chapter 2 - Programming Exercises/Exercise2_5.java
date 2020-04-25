/*
 * Chapter 2 - Exercise 2.5
 * (Financial application: calculate tips) Write a program that reads the subtotal and
 * the gratuity rate, then computes the gratuity and total. For example, if the user
 * enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gra-
 * tuity and $11.5 as total. Here is a sample run:
 *
 * Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 *
 */
 
import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double gratuityRate, gratuity, subtotal, total;
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		
		gratuity = (gratuityRate / 100.0) * subtotal;
		total = subtotal + gratuity;
		
		System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
	}
}