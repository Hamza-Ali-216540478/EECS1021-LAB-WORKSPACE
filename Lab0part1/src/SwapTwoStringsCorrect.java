
public class SwapTwoStringsCorrect {

	public static void main(String[] args) {
	String person1 = "Alan";
	String person2 = "Tom";
	
	System.out.println("before the swap");
	System.out.println("person1 is" + person1 + " and");
	System.out.println("person2 is" + person2 + ".");
	
	//swap
	// Correct Implementation
	String temp = person1; // temp stores Alan
	person1 = person2; // person1 stores Tom
	// so far person1 has been swapped
	// now we use temp to swap person2
	person2 = temp;
	
	
	System.out.println("After the swap");
	System.out.println("person1 is " + person1 + " and ");
	System.out.println("person2 is " + person2 + ".");
	
	// exercise 
	// swap two integers x and y. and swap them.
	
	int i = 21;
	int k = 100;
	System.out.println("before the swap");
	System.out.println("i is " + i + " and");
	System.out.println("k is " + k + ".");
	
	int t = i;
	i = k;
	k = t;
	
	System.out.println("After the swap");
	System.out.println("i is " + i + " and ");
	System.out.println("k is " + t + ".");
	
	
	
	}

}
