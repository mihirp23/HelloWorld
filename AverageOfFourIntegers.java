/*
 * Author : Mihir Patel
 *   Date : 11/1/17
 *   File : AverageOfFourIntegers.java
 *   --------------------------------------
 *   Exercise 3.8
 *   This program computes the average of four integers 
 *   entered by the user.
 */

import acm.program.*;

public class AverageOfFourIntegers extends ConsoleProgram {
	public void run () {
		println("Average calculator ");
		int n1 = readInt("enter n1: ");
		int n2 = readInt("enter n2: ");
		int n3 = readInt("enter n3: ");
		int n4 = readInt("enter n4: ");
		double average = (n1 + n2 + n3 + n4) / 4.0;
		println("The average of these numbers is " + average);
	}

}
