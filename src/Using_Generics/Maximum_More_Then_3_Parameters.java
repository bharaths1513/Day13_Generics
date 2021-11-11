package Using_Generics;

public class Maximum_More_Then_3_Parameters<E extends Comparable> {
	E value1, value2, value3;

	public Maximum_More_Then_3_Parameters(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public static <E extends Comparable> E testMaximum(E value1, E value2, E value3) {
		E max = value1;
		if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
			max = value2;
		else if (value3.compareTo(value1) > 0 && value3.compareTo(value2) > 0)
			max = value3;
		print(value1, value2, value3, max);
		return max;
	}

	static <E> void print(E value1, E value2, E value3, E max) {
		System.out.println("Max of " + value1 + ", " + value2 + ", " + value3 + " is " + max);
	}

	public static void main(String[] args) {
		testMaximum(50, 40, 90);

	}
}
