/*   File : AreaOfCircle.java
 *   Date : 11/1/17
 * Author : Mihir Patel
 * --------------------------------
 * Exercise 3.4
 * This program prompts the user for radius of a circle.
 * It then computes the area of that circle.
 */

import acm.program.*;
import java.lang.Math;

public class AreaOfCircle extends ConsoleProgram {
	public void run() {
		println("Circle Area Calculator");
		double radius = readDouble("Enter radius: ");
		double area = Math.PI * (radius * radius);
		println ("The area of circle with radius " + radius + " is " + area);
	}
}
