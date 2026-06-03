
// Order of Precedence in Java: () > ++ -- > * / % > + - > > < = > && || > ?: > =

public class Exercise08_OperatorPrecedence {
	public static void main(String[] args) {

		int a = 15, b = 10, c = 20;
		System.out.println("Operator Precedence Demo\n");

		int arith = 10 + 5 * 2 - 8 / 4 + 5 % 3;

		/*
		Arithmetic + Precedence  ( * / % before + - )
		Step 1 : 5 * 2  = 10
		Step 2 : 8 / 4  = 2
		Step 3 : 5 % 3  = 2
		Step 4 : 10 + 10 - 2 + 2 = 20
		*/

		boolean logic = (a > b && b < c) || (a < c);

		/*
		 Relational + Logical  ( > < before && before || )
		 Step 1 : a > b        = 15 > 10 = true
		 Step 2 : b < c        = 10 < 20 = true
		 Step 3 : true && true = true
		 Step 4 : a < c        = 15 < 20 = true
		 Step 5 : true || true = true
		*/

		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		/*
		  Ternary - Nested  ( inner ?: before outer ?: )
		  Step 1 : a > b        = 15 > 10 = true
		  Step 2 : a > c        = 15 > 20 = false -> returns c
		  Step 3 : max          = 20
		*/

		a += b * 2 - 3;

		/*
		 Assignment with Expression  ( * - before += )
		 Step 1 : b * 2        = 10 * 2 = 20
		 Step 2 : 20 - 3       = 17
		 Step 3 : a = a + 17   = 15 + 17 = 32
		 */

		System.out.println("Arithmetic Result = " + arith);
		System.out.println("Logical Result    = " + logic);
		System.out.println("Maximum Value     = " + max);
		System.out.println("Updated a         = " + a);

	}
}