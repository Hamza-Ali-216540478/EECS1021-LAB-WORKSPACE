import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name+", enter your height in inches:");
		int height = input.nextInt();
		
		System.out.println(name+", enter your weight in pounds:");
		int weight = input.nextInt();
		
		double heightCm= 0.0254*height;
		
		double weightKg= 0.45359237*weight;
		
		double BMI = weightKg/(heightCm*heightCm);
		
		System.out.println(name+", your BMI is "+BMI);
		
		if(18.5>BMI) {
			System.out.println("You are underweight");
		}
		else if(18.5<BMI && BMI<25.0) {
			System.out.println("You are normal");
		}
		else if(25.0<=BMI && BMI<30.0) {
			System.out.println("You are overweight");
		}
		else if(BMI>=30.0) {
			System.out.println("You are obese");
		}
		input.close();
	}

}


