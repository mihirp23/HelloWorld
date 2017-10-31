/* File     : AreaOfTriangle.java
 * Date     : 10/30/17
 * Exercise : 2.2
 * ----------------------------------------
 * This program prompts the user to enter base and height of 
 * a triangle. It then computes the area of that triangle.
 */

import acm.program.*;

public class AreaOfTriangle extends ConsoleProgram {
	public void run() {
	    double base = readDouble("Enter base of triangle  : ");
	    double height = readDouble("Enter height of triangle : ");
	    double area = (base * height) / 2;
	    println("Area of triangle is : " + area );
	}
}
