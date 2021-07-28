package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        // Add more JUnit tests like the one above to test your method
        assertEquals(36, RecursionMath.recursiveMultiplication(6, 6));
        assertEquals(100, RecursionMath.recursiveMultiplication(1, 100));
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(2, RecursionMath.recursiveDivision(10, 5));
    	assertEquals(50, RecursionMath.recursiveDivision(100, 2));
    	assertEquals(0, RecursionMath.recursiveDivision(10, 20));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(8, RecursionMath.recursivePower(2, 3));
        assertEquals(25, RecursionMath.recursivePower(5, 2));
    }
}
