
public class LogicalOperations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * there are three logical operator for you to
		 * combine relational operations (each of which evaluates true or false)
		 * 1. logical negation(not)      !
		 * 2. logical conjunction (and)    &&
		 * 3. logical disjunction (or)    ||
		 * 
		 */
		boolean p = true;
		boolean negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + !negation);
		p = false;
		negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + !negation);
	}

}
