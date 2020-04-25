/*
 * Chapter 2 - Exercise 2.6
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the 
 * sum of all its digits is 14.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * Here is a sample run:
 *
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 *
 */
 
import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	        int userNum, sum, num1, num2, num3;

		System.out.print("Enter a number between 0 and 1000: ");
		userNum = input.nextInt();
		
        	num1 = userNum % 10;
		num2 = userNum % 100 % 10;
		num3 = userNum % 1000 % 100 % 10;

		sum = num1 + num2 + num3;

		System.out.print("The sum of the digits is " + sum);
	}
}
