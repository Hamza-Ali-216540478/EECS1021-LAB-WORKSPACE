
public class NumberVariables {

	public static void main(String[] args) {
		int i = 5; // declare i to be a variable storing integers only, with an initial value 1
		System.out.println("i's value is " + i); // i's value is:5 
		i = 7;
		System.out.println("After changing i's value to 7");
		System.out.println("i's value is " + i); // i's value is: 7
		
		double x = 7.2;
		double y = 3.0;
		System.out.println("Average between x and y is: " + ((x+y) / 2)); // should be 5.1
		// unflexible solution: every time values of x and y above are changed,
		// we have to modify the contens of the string literal below
		//System.out.println("Average between 7.2 and 3.0 is: " + ((x+y) / 2)); // 5.1 ?
		
		// flexible solution
		// we do not need to modify the x and y below, because they simply denote the currently stored
		// values in x and y
		System.out.println("Average between " + x + " and " + y +" is: " + ((x+y) / 2)); // 5.1
		
	}

}
