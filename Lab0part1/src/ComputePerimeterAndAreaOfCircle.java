import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

public static void main(String[] args) {

Scanner i=new Scanner(System.in);

System.out.print("Enter an integer for radius: ");
int radius=i.nextInt();
i.nextLine(); 
				
	System.out.print("Whats your name? ");
String name=i.nextLine();
		
		double perimeter = 2*3.14 * radius; 
		
		double area = 3.14 * radius * radius;
		
	System.out.print(name +", your input circle with radius " + radius + " has perimeter "+ perimeter +  " and area " + area);
		
		i.close();
	}

}
