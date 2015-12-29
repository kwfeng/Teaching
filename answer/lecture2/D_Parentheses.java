package teaching.answer.lecture2;

public class D_Parentheses {

	private static void printPar(int l, int r, char[] str, int count) {
		if (l < 0 || r < l) return; // invalid state
		if (l == 0 && r == 0) {
			System.out.println(str); // found one, so print it
		} else {
			if (l > 0) { // try a left paren, if there are some available
				str[count] = '(';
				printPar(l - 1, r, str, count + 1);
			}
			if (r > l) { // try a right paren, if there¡¯s a matching left
				str[count] = ')';
				printPar(l, r - 1, str, count + 1);
			}
		}
		
	}

	public static void printPar(int n){
		char[] c = new char[n*2];
		printPar(n, n, c, 0);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 2;
		D_Parentheses.printPar(n);

	}

}
