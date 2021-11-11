package Using_Generics;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {

	@Test
	public void integer1() {
		Integer actualValue = Maximum.getmaximum(50, 80, 60);
		Assert.assertEquals(80, actualValue, 0);
	}

	@Test
	public void float1() {
		Float actualValue = Maximum.getmaximum(20.1f, 60.5f, 10.1f);
		Assert.assertEquals(60.5f, actualValue);
	}

	@Test
	public void string1() {
		String actualValue = Maximum.getmaximum("Avinash", "Rakesh", "Bharath");
		Assert.assertEquals("Rakesh", actualValue);
	}

}
