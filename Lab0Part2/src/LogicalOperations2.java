
public class LogicalOperations2 {

	public static void main(String[] args) {
		boolean p = false;
		boolean q = false;
		boolean conjunction = p && q;
		System.out.println("conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("disjunction of " + p + " and " + q + " is: " + ( p || q ));
		
		p = false;
		q = true;
		conjunction = p && q;
		System.out.println("conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("disjunction of " + p + " and " + q + " is: " + ( p || q ));
		
		p = true;
		q = false;
		conjunction = p && q;
		System.out.println("conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("disjunction of " + p + " and " + q + " is: " + ( p || q ));
		
		p = true;
		q = true;
		// this line is crucial to make sure
		// when you print out the value of ' conjunction'. it reflects the most up to date values
		// stored in p and q.
	    conjunction = p && q;
		System.out.println("conjunction of " + p + " and " + q + " is: " + conjunction);
		System.out.println("disjunction of " + p + " and " + q + " is: " + ( p || q ));
	}

}
