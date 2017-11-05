/* 
 * Author : Mihir Patel
 *   Date : 11/1/17
 *   File : KiloToPounds.java
 *   ---------------------------------------
 *   Exercise 3.7
 *   This program prompts user to enter weight in Kilograms
 *   and then converts it to Pounds / Ounces.
 */

import acm.program.*;

public class KiloToPounds extends ConsoleProgram {
	public void run() {
		println("Kilograms to Pounds Converter");
		double kg = readDouble("Enter weight in kg: ");
		double pounds = kg * POUNDS_PER_KG;
		double ounces = pounds * OUNCES_PER_POUND;
		println(kg + "kg is " + pounds + " pounds ");
		println(kg + "kg is " + ounces + " ounces ");
	}
	private static final double POUNDS_PER_KG = 2.2;
	private static final double OUNCES_PER_POUND = 16;
}
