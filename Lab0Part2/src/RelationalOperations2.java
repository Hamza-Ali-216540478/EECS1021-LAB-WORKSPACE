
public class RelationalOperations2 {

	public static void main(String[] args) {
		int x = 23;
		int y = 23;
		System.out.println("after initializing x to 56 and y to 89");
		System.out.println("x== y: " + (x == y)); // 23 == 23
		System.out.println("x < y: " + ( x < y)); // 23 < 23
		System.out.println("x <= y: " + (x <= y)); // 23 <== 23
		System.out.println("x >= y: " + ( x >= y)); // 23 >== 23
		System.out.println("x > y: " + ( x > y)); // 23 > 23
		x = 56;
		y = 89;
		System.out.println(" after re-assining x to 56 and y to 89.");
		System.out.println("x== y: " + (x == y)); // 23 == 23
		System.out.println("x < y: " + ( x < y)); // 23 < 23
		System.out.println("x <= y: " + (x <= y)); // 23 <== 23
		System.out.println("x >= y: " + ( x >= y)); // 23 >== 23
		System.out.println("x > y: " + ( x > y)); // 23 > 23
		x = 101;
		y = 48;
		System.out.println(" after re-assining x to 101 and y to 48.");
		System.out.println("x== y: " + (x == y)); // 23 == 23
		System.out.println("x < y: " + ( x < y)); // 23 < 23
		System.out.println("x <= y: " + (x <= y)); // 23 <== 23
		System.out.println("x >= y: " + ( x >= y)); // 23 >== 23
		System.out.println("x > y: " + ( x > y)); // 23 > 23
	}

}
