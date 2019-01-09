
public class SwapTwoStringsWrong {

	public static void main(String[] args) {
	String person1 = "Alan";
	String person2 = "Tom";
	
	System.out.println("before the swap");
	System.out.println("person1 is" + person1 + " and");
	System.out.println("person2 is" + person2 + ".");
	
	//swap
	// Wrong Implementation
	person1 = person2;
	person2 = person1;
	
	System.out.println("After the swap");
	System.out.println("person1 is " + person1 + " and ");
	System.out.println("person2 is " + person2 + ".");

	}

}
