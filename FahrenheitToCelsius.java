/* 
 *   File : FahrenheitToCelsius.java
 *   Date : 11/1/17
 * Author : Mihir Patel
 * ---------------------------------------------
 * Exercise 3.5
 * This program prompts user for temperature in
 * Fahrenheit and then converts it to Celsius.
 */

import acm.program.*;

public class FahrenheitToCelsius extends ConsoleProgram {
	public void run() {
		println ("Fahrenheit to Celsius Converter");
		double fah = readDouble("Enter temperature in Fahrenheit: ");
		double celsius = (5.0 / 9.0) * (fah - 32);
		println(fah + " degrees fahrenheit is " + celsius + " degrees celsius ");
	}
}
