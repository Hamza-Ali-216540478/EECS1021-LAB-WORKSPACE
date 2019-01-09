
public class StringVariables {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		int i = 1;
		
		System.out.println("Person" + i + ":" + lastName + "," + firstName);
		
		firstName = "Ali";
		lastName = "Hamza";
		i = i + 1;
		System.out.println("Person" + i + ":" + lastName + "," + firstName);
		
		firstName = "Jim";
		lastName = "Johnson";
		i = i + 1;
		System.out.println("Person" + i + ":" + lastName + "," + firstName);
		
		/*
		 * remark:
		 * lines 9, 14, and 19 are identical
		 * however, at runtime they produce different outputs in the console
		 * this is because they depend on values of variables which are changed
		 * at lines 5-9, 11-14, 16-19.
		 */
		
	}

}
