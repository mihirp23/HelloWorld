/* File : HelloProgram.java
 * Date : 10/30/17
 * --------------------------
 * This program displays "hello, world" on the screen.
 * It is inspired by the first program in Brian 
 * Kernighan's and Dennis Ritchie's classical book,
 * The C Programming Language
 */

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
	public void run() {
	    add (new GLabel("hello, world"), 100, 75);	
	}
}
