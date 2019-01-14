import java.util.Scanner;

public class LogicalOperationApp1a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		 * develop a console application that
		 * determines if the user's entered integer is positive (> 0)
		 * the logical negation is i > 0 is !(i > 0), which is equivalent to i <= 0
		 */
		System.out.println(" enter an integer ");
		int i = input.nextInt();
		boolean isLessThanOrEqualToZero = i > 0;
		System.out.println("the number you entered was positive: " + !isLessThanOrEqualToZero);
		//System.out.println("the number you entered was positive: " + !(!(i > 0));
		
		
		
	}

}
