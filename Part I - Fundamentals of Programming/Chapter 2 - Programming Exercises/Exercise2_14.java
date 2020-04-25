/*
 * Chapter 2 - Exercise 2.14
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
 * a sample run:
 * 
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 */
import java.util.*;

public class Exercise2_14 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double bmi, weightLb, heightIn, weightKg, heightMt = 0.0;
		
		System.out.print("Enter weight in pounds: ");
		weightLb = stdin.nextDouble();
		
		System.out.print("Enter height in inches: ");
		heightIn = stdin.nextDouble();
		
		weightKg = weightLb * 0.453592;
		heightMt = heightIn / 39.3701;
		
		bmi = weightKg / (heightMt * heightMt);
		
		System.out.print("BMI is " + bmi);
	
	}
}