/*
 * Chapter 2 - Exercise 2.27
 * (Financial application: payroll) Rewrite Exercise 2.25 using GUI input and
 * output dialog boxes.
 *
 */

import javax.swing.*  ;

public class Exercise2_27 {
	public static void main(String[] args) {
		
		String input, emplName;
		double num0fHours, grossPay, totalDed, hrPayRate, fedRate, fedWith, stateRate, stateWith, netPay;
		
		input = JOptionPane.showInputDialog("Enter employee's name: ");
		emplName = input;
		input = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		num0fHours = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		hrPayRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter federal tax withholding rate (as a decimal): ");
		fedRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter state tax withholding rate (as a decimal): ");
		stateRate = Double.parseDouble(input);
		
		grossPay = hrPayRate * num0fHours;
		fedWith = fedRate * grossPay;
		stateWith = stateRate * grossPay;
		totalDed =  fedWith + stateWith;
		netPay = grossPay - totalDed;
		
		String output = ("\nEmployee Name: " + emplName +
	                     "\nHours Worked: " + num0fHours +
		                 "\nPay Rate: $" + hrPayRate +
		                 "\nGross Pay: $" + grossPay +
		                 "\nDeductions:" +
		                 "\n  Federal Withholding (" + (fedRate * 100) + "%): $" + fedWith +
		                 "\n  State Withholding (" + (stateRate * 100) + "%): $" + stateWith +
		                 "\n  Total Deduction: $" + totalDed +
		                 "\nNet Pay: $" + netPay);
						 
	    JOptionPane.showMessageDialog(null, output);
		
	}	
}
		
		