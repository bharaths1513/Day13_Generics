package Day13_Generics;

public class Maximum {
// Checking Maximum Integer Between Three Values
	public static Integer getmaximuminteger(Integer value1, Integer value2, Integer value3) {
		Integer max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		System.out.println(max);

		return max;
	}

	// Checking Maximum Float value Between Three Values
	public static Float getmaximumfloat(Float value1, Float value2, Float value3) {
		Float max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
			max = value3;
		System.out.println(max);
		return max;
	}

	// Checking Maximum String Between Three Values
	public static String getmaximumstring(String value1, String value2, String value3) {
		String max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value1) > 0 && value3.compareTo(value2) > 0)
			max = value3;
		System.out.println(max);
		return max;
	}

}
