/**
 * 
 */
package tests;

import org.junit.Test;

import code.CompositeDisplayALetter;
import code.DisplayALetter;
import code.DisplayLetterFactory;

/**
 * @author oded
 *
 */
public class CompositeDisplayALetterTest {
	
	@Test
	public void test() {
		
		DisplayLetterFactory factory = new DisplayLetterFactory();
		
		DisplayALetter a = factory.Display("A");
		DisplayALetter b = factory.Display("B");
		DisplayALetter c = factory.Display("C");
		
		CompositeDisplayALetter top = new CompositeDisplayALetter();
		CompositeDisplayALetter bottomLeft = new CompositeDisplayALetter();
		CompositeDisplayALetter bottomRight = new CompositeDisplayALetter();
		
		top.add(bottomLeft);
		top.add(bottomRight);
		bottomLeft.add(a);
		bottomRight.add(b);
		bottomRight.add(c);
		
		top.displayYourLetter();		
	}

}
