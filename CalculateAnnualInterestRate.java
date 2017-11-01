/*   File : CalculateAnnualInterestRate
 *   Date : 11/1/17
 * Author : Mihir Patel
 * ------------------------------------------
 * Exercise 3.2 
 * This program prompts user for account balance and 
 * and annual interest rate expressed as a percentage.
 * It then calculates and displays the new balance
 * after a year.
 * Exercise 3.3
 * Extended the program to display the balance after
 * two years have elapsed.
 */

import acm.program.*;

public class CalculateAnnualInterestRate extends ConsoleProgram {
	public void run () {
		println("Interest calculation program");
		double balance = readDouble("Enter starting balance : ");
		double interest_rate = readDouble ("Enter annual interest rate: ");
		balance += (balance * (interest_rate / 100));
		println("Balance after one year = " + balance);
		balance +=  (balance * (interest_rate / 100));
		println("Balance after two years = " + balance);
	}
}
