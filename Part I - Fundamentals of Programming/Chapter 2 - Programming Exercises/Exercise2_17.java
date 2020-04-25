/*
 * Chapter 2 - Exercise 2.17
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is
 * not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside. In
 * 2001, the National Weather Service (NWS) implemented the new wind-chill temperature
 * to measure the coldness using temperature and wind speed. The formula is:
 * 
 * 					twc = 35.74 + 0.6215ta - 35.75v ^ 0.16 + 0.4275tav ^ 0.16
 *
 * where is ta the outside temperature measured in degrees Fahrenheit and v is the speed
 * measured in miles per hour. twc is the wind-chill temperature. The formula cannot be
 * used for wind speeds below 2 mph or temperatures below -58 degrees Fahrenheit or above 41 degrees Fahrenheit.
 *
 * Write a program that prompts the user to enter a temperature between -58 degrees Fahrenheit and
 * and 41 degrees Fahrenheit a wind speed greater than or equal to 2 and displays the wind-chill 
 * temperature. Use Math.pow(a, b) to compute v ^ 0.16. Here is a sample run:
 * 
 * Enter the temperature in Fahrenheit: 5.3
 * Enter the wind speed in miles per hour: 6
 * The wind chill index is -5.56707
 */
import java.util.*;
import java.lang.Math; 

public class Exercise2_17 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); 
		double twc, ta, v = 0.0;
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		ta = stdin.nextDouble();
		
		System.out.print("Enter the wind speed in miles per hour: ");
		v = stdin.nextDouble();
		
		twc = 35.74 + (0.6215 * ta) - ( 35.75 * Math.pow(v, 0.16) ) + ( 0.4275 * ta * Math.pow(v, 0.16) );
		
		System.out.print("The wind chill index is " + twc);
	
	}
}