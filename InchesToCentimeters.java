/*        File : InchesToCentimeters.java
 *        Date : 11/1/17
 * Description : Exercise 3.1
 * -----------------------------------------------------------------
 * THis program converts inches to centimeters.
 * Extended the program to convert Feet and Inches to Centimeters.
 * -----------------------------------------------------------------
 */

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
    public void run() {
    	println("This program converts inches to centimeters.");
    	int feet = readInt("Enter number of feet: ");
    	int inches = readInt("Enter number of inches: ");
    	int total_inches = inches + feet * INCHES_PER_FOOT;
    	double cm = (total_inches * CENTIMETERS_PER_INCH);
    	println(feet + "ft " + inches + "in = " + cm + "cm");
    }
    
    private static final double CENTIMETERS_PER_INCH = 2.54;
    private static final int INCHES_PER_FOOT = 12;
}
