/* File     : Add2Integers.java
 * Date     : 10/30/17
 * Exercise : 2.3
 * ----------------------------
 * This program adds 3 integers and prints their sum.
 */

import acm.program.*;

public class Add3Integers extends ConsoleProgram {
	public void run () {
	    println ("This program adds 3 integers.");
	    int n1 = readInt("Enter n1 : ");
	    int n2 = readInt("Enter n2 : ");
	    int n3 = readInt("Enter n3 : ");
	    int total = n1 + n2 + n3;
	    println ("The total is " +  total);
	}
}
