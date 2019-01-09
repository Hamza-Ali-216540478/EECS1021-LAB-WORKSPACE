import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {	
Scanner i=new Scanner(System.in);
		
System.out.print("Whats your name? ");
		String name=i.nextLine();
		
		System.out.print("Enter an integer for seconds: ");
		int seconds=i.nextInt();
		
		int minutes=seconds / 60; 
		
	int secondsLeft=seconds % 60;
		
	System.out.print(name +", your input " + seconds + " seconds can be divided into "+ minutes +  " minutes" + " and " + secondsLeft + " seconds.");
		
i.close();
		
		
		
	}

}