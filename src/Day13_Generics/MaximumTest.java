package Day13_Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
	// To Test the Maximum Integer between three values
	@Test
	public void intmax1() {
		Integer actualValue = Maximum.getmaximuminteger(90, 42, 10);
		Assert.assertEquals(90, actualValue, 0);
	}

	@Test
	public void intmax2() {
		Integer actualValue = Maximum.getmaximuminteger(10, 70, 50);
		Assert.assertEquals(70, actualValue, 0);
	}

	// To Test the Maximum Float value between three values
	@Test
	public void floatMax1() {
		Float actualValue = Maximum.getmaximumfloat(12f, 14f, 15f);
		Assert.assertEquals(15, actualValue, 0);
	}

	@Test
	public void floatMax2() {
		Float actualValue = Maximum.getmaximumfloat(1000f, 545f, 746f);
		Assert.assertEquals(1000, actualValue, 0);
	}

	// To Test the Maximum String between three values
	@Test
	public void stringmax1() {
		String actualValue = Maximum.getmaximumstring("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", actualValue);
	}

	@Test
	public void stringmax2() {
		String actualValue = Maximum.getmaximumstring("Avinash", "Rakesh", "Bharath");
		Assert.assertEquals("Bharath", actualValue);
	}
}