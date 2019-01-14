import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		 * develop a console application that
		 * determines if the user's entered integer is positive (> 0)
		 */
		System.out.println(" enter an integer ");
		int i = input.nextInt();
		boolean isPositive = i > 0;
		System.out.println("the number you entered was positive: " + isPositive);
		//System.out.println("the number you entered was positive: " + (i>0));
		
		
		
	}

}
