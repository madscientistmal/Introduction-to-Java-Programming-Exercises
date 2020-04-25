/*
 * Chapter 2 - Exercise 2.22
 * (Random character) Write a program that displays a random uppercase letter
 * using the System.CurrentTimeMillis() method.
 */
import java.util.*;
import java.lang.*;

public class Exercise2_22 {
	public static void main(String[] args) {
		
		Random rand = new Random(System.currentTimeMillis());
		char random;
		
	    random = (char)(rand.nextInt(90 - 65) + 65 );
		
		System.out.print(random);
	
	}
}