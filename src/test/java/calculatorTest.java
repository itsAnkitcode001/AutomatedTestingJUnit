import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import CalculatorProject.Calculator;

public class calculatorTest {
	Calculator calc;
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void addTwoNumbers() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers1() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers2() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers3() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers4() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers5() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers6() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers7() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers8() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers9() {assertEquals(20, calc.add(10, 10));}
	@Test
	public void addTwoNumbers10() {assertEquals(20, calc.add(10, 10));}

	@Test
	public void addThreeNumbers() {
		assertEquals(20, calc.add(5, 5, 10));
		
	}
	@Test
	public void addThreeNumbers1() {
		assertEquals(20, calc.add(5, 5, 10));
		
	}

	@Test
	public void subtractTwoNumbers() {
		assertEquals(0, calc.subtract(10, 10));
		
	}

	@Test
	public void subtractThreeNumbers() {
		assertEquals(0, calc.subtract(20, 10, 10));
		
	}
}
