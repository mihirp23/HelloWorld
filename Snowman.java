/* File : DrawRobot.java
 * Date : 10/30/17
 * Exercise : 2.4
 * ---------------------------------
 * This program draws a simple snowman using geometric shapes.
 */

import acm.graphics.*;
import acm.program.*;

public class Snowman extends GraphicsProgram {
	public void run() {
		// upper body
	    add (new GOval(120, 20, 40, 40));
	    
	    // body
	    add (new GOval(100, 60, 80, 40));
	    
	    // lower body
	    add (new GOval(70, 100, 140, 80));
	    
	    // body parts
	    add (new GRect(135,80,10,10));
	    add (new GRect(135,65,10,10));
	    
	    // eyes
	    add (new GOval(130, 30, 5,5));
	    add (new GOval(145, 30, 5,5));
	    
	    // nose
	    add (new GLabel("V", 137, 45));
	    
	    // mouth
	    add (new GOval(137, 50, 5, 5));
	    
	}
}
