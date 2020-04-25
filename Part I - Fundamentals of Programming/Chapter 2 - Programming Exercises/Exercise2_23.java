/*
 * Chapter 2 - Exercise 2.23
 * (Find the character of an ASCII code) Write a program that receives an ASCII
 * code (an integer between 0 and 127) and displays its character. For example, if the
 * user enters 97, the program displays character a. Here is a sample run:
 *
 * Enter an ASCII code: 69
 * The character is E
 */
import java.util.*;

public class Exercise2_23 {
	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		int asciiGuess;
		
		System.out.print("Enter an ASCII code: ");
		asciiGuess = stdin.nextInt();

		System.out.print("The character is " + (char)asciiGuess);
	
	}
}