/*
 * Chapter 2 - Exercise 2.4
 * (Convert pounds into kilograms) Write a program that converts pounds into kilo-
 * grams. The program prompts the user to enter a number in pounds, converts it to
 * kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 * sample run:
 *
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 *
 */
 
import java.util.Scanner;

public class Exercise2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double weightLbs, weightKgs;
		
		System.out.print("Enter a number in pounds: ");
		weightLbs = input.nextDouble();
		
		weightKgs = weightLbs * 0.454;
		
		System.out.print(weightLbs + " pounds is " + weightKgs + " kilograms");
	}
}