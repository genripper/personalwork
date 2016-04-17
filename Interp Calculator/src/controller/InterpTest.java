package controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpTest {

	@Test
	public void testDoMath() {
		System.out.println("doMath");
        double x1 = 1;
        double x2 = 4;
        double x3 = 14;
        double y1 = 0.24;
        double y3 = 0.28;
        double expResult = 0.24923076923077;
        double result = Interp.doMath(x1, x2, x3, y1, y3);
        assertEquals(expResult, result, 0.0000000000001);
	}

}
