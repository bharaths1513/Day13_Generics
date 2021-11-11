package Using_Generics;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum1Test {

	@Test
	public void testinteger() {
		Integer actualValue = Maximum1.testMaximum(10, 50, 15);
		Assert.assertEquals(50, actualValue, 0);
	}

	@Test
	public void testfloat() {
		Float actualValue = Maximum1.testMaximum(16.5f, 20.7f, 30.9f);
		Assert.assertEquals(30.9f, actualValue, 0);
	}

	@Test
	public void teststring() {
		String actualValue = Maximum1.testMaximum("Avinash", "Bharath", "Rakesh");
		Assert.assertEquals("Rakesh", actualValue);
	}
}
