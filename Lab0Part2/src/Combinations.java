import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st string:");
		String String1=input.nextLine();
		
		System.out.println("Enter the 2nd string:");
		String String2=input.nextLine();
		
		System.out.println("Enter the 3rd string:");
		String String3=input.nextLine();
		
		System.out.println("Enter the 4th string:");
		String String4=input.nextLine();
		
		System.out.println("Enter the 1st integer:");
		int Integer1=input.nextInt();
		
		System.out.println("Enter the 2nd integer:");
		int Integer2=input.nextInt();

		System.out.println("Enter the 3rd integer:");
		int Integer3=input.nextInt();

		System.out.println("Enter the 4th integer:");
		int Integer4=input.nextInt();

		System.out.println("Here are all 16 possible combinations:");
		
		System.out.println("("+String1+","+Integer1+")");
		System.out.println("("+String1+","+Integer2+")");
		System.out.println("("+String1+","+Integer3+")");
		System.out.println("("+String1+","+Integer4+")");
		
		System.out.println("("+String2+","+Integer1+")");
		System.out.println("("+String2+","+Integer2+")");
		System.out.println("("+String2+","+Integer3+")");
		System.out.println("("+String2+","+Integer4+")");
		
		System.out.println("("+String3+","+Integer1+")");
		System.out.println("("+String3+","+Integer2+")");
		System.out.println("("+String3+","+Integer3+")");
		System.out.println("("+String3+","+Integer4+")");
		
		System.out.println("("+String4+","+Integer1+")");
		System.out.println("("+String4+","+Integer2+")");
		System.out.println("("+String4+","+Integer3+")");
		System.out.println("("+String4+","+Integer4+")");
		input.close();
		
	}

}
