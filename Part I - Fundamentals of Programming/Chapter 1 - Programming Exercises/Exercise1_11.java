/*
 * Chapter 1 - Exercise 1.11
 * (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 * 
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five years. Assume
 * the current population is 312,032,486 and one year has 365 days. Hint: In Java, if
 * two integers perform division, the result is an integer. The fraction part is trun
 * cated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
 *
 */

public class Exercise1_11 {
	public static void main(String[] args) {
		System.out.println("Current Population of the United States of America: 312,032,486");
		System.out.println("Assuming that there are:");
		System.out.println("■ One birth every 7 seconds");
		System.out.println("■ One death every 13 seconds");
		System.out.println("■ One new immigrant every 45 seconds");
		System.out.println("The population in the next 5 years would be as follows:");
		
		System.out.println("Year 1: " + ( 312032486.0 + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 7.0) - 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 13.0) + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 45.0)) );
						  
	    System.out.println("Year 2: " +  (312032486.0 + 
						   2.0 * (((60.0 * 60.0 * 24.0 * 365.0) / 7.0) - 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 13.0) + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 45.0)))  );
						   
		System.out.println("Year 3: " +  (312032486.0 + 
						   3.0 * (((60.0 * 60.0 * 24.0 * 365.0) / 7.0) - 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 13.0) + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 45.0)))  );
						 
        System.out.println("Year 4: " +  (312032486.0 + 
						   4.0 * (((60.0 * 60.0 * 24.0 * 365.0) / 7.0) - 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 13.0) + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 45.0)))  );
						  
		System.out.println("Year 5: " +  (312032486.0 + 
						   5.0 * (((60.0 * 60.0 * 24.0 * 365.0) / 7.0) - 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 13.0) + 
						  ((60.0 * 60.0 * 24.0 * 365.0) / 45.0)))  );
	}
}