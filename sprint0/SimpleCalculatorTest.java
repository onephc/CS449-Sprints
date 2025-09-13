package sprint0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void additionOfTwoAndTwoTest() {
		var calculator = new SimpleCalculator();
		assertEquals(4, calculator.addition(2, 2));
	}
	
	@Test
	void additionOfTwoAnd15Test() {
		var calculator = new SimpleCalculator();
		assertEquals(4, calculator.addition(2, 15));
	}
	
}
