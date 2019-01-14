import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st integer in sequence 1:");
		int Integer1_1=input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 1:");
		int Integer1_2=input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 1:");
		int Integer1_3=input.nextInt();
		System.out.println("Enter the 4th integer in sequence 1:");
		int Integer1_4=input.nextInt();
		System.out.println("Enter the 1st integer in sequence 2:");
		int Integer2_1=input.nextInt();
		System.out.println("Enter the 2nd integer in sequence 2:");
		int Integer2_2=input.nextInt();
		System.out.println("Enter the 3rd integer in sequence 2:");
		int Integer2_3=input.nextInt();
		System.out.println("Enter the 4th integer in sequence 2:");
		int Integer2_4=input.nextInt();
		
		int sum=Integer1_1*Integer2_1+Integer1_2*Integer2_2+Integer1_3*Integer2_3+Integer1_4*Integer2_4;
		
		System.out.println("sum(["+Integer1_1+","+Integer1_2+","+Integer1_3+","+Integer1_4+"] * ["+Integer2_1+","+Integer2_2+","+Integer2_3+","+Integer2_4+"]) = "+sum);
		
		input.close();
	}

}


