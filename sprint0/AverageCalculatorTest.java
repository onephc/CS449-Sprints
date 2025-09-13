package sprint0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageCalculatorTest {

	@Test
	void averageTestOfOneandThree() {
		var averageCalc = new AverageCalculator();
		assertEquals(2, averageCalc.average(1, 3));
	}
	
	@Test
	void averageTestOfOneAndTen() {
		var averageCalc = new AverageCalculator();
		assertEquals(2, averageCalc.average(1, 10));
			
	}

}
