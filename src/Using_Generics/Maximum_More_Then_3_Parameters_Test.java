package Using_Generics;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum_More_Then_3_Parameters_Test {

	@Test
	public void integer() {
		Integer actualValue = Maximum_More_Then_3_Parameters.testMaximum(100, 50, 30);
		Assert.assertEquals(100, actualValue, 0);
	}

	@Test
	public void float1() {
		Float actualValue = Maximum_More_Then_3_Parameters.testMaximum(20.1f, 50.5f, 67.8f);
		Assert.assertEquals(67.8f, actualValue, 0);

	}
}
