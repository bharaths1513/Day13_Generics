package Day13_Generics;

public class compare {

	public void compare(String str1, String str2, String str3) {

		Integer l1 = str1.length();
		Integer l2 = str2.length();
		Integer l3 = str3.length();

		String max = str1;
		if (l2.compareTo(l1) > 0 && l2.compareTo(l3) > 0) {
			max = str2;
		} else if (l3.compareTo(l1) > 0 && l3.compareTo(l2) > 0) {
			max = str3;
		}
		System.out.println(max);
	}

}
