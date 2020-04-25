/*
 * Chapter 2 - Exercise 2.11
 * (Population projection) Rewrite Exercise 1.11 to prompt the user to enter the
 * number of years and displays the population after the number of years. Here is a
 * sample run of the program:
 * 
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */
import java.util.*;

public class Exercise2_11 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numOfYears;
		double futurePop, births, deaths, secondsInYear, immigrants = 0;
		double currentPop = 312032486;
		
		System.out.println("Current Population of the United States of America: " + currentPop);
		System.out.println("Assuming that there are:");
		System.out.println("■ One birth every 7 seconds");
		System.out.println("■ One death every 13 seconds");
		System.out.println("■ One new immigrant every 45 seconds");
		
		secondsInYear = 60.0 * 60.0 * 24.0 * 365.0;
		
		births = secondsInYear / 7.0;
		deaths = secondsInYear / 13.0;
		immigrants = secondsInYear / 45.0;
		
		System.out.print("\nEnter the number of years: ");
		numOfYears = stdin.nextInt();
		
		futurePop = (currentPop + (numOfYears * (births + immigrants - deaths)));
		
		System.out.println("The population in " + numOfYears + " years is " + futurePop);
	
	}
}