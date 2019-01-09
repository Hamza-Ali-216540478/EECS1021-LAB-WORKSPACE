
public class StringExpressions {

	public static void main(String[] args) {
		System.out.println("We have various attempts to calculate the average between 5 and 2");
		System.out.print(" 5+2 /2 is");
		System.out.println(5 + 2 / 2);
		System.out.println("(5+2) / 2 is " + ((5+2) / 2));
		System.out.println("(5+2) / 2.0 is " + ((5+2) / 2.0));
		System.out.println("Lassonde School of Engineering");
		System.out.println("Lassonde" + " " + "School" + " " + "of" + " " + "Engineering");
		
		System.out.println("Experiment with concatenating (1+1)" + (1+1));
		// result is 11 since there are 2 concatenations
		System.out.println("experiment with concatenating 1 + 1: " + 1 + 1);
	}

}
