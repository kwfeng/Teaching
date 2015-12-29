package teaching.answer.lecture2;

public class E_GrayCode {

	public static void moves(int n, boolean forward){
		if(n==0) return;
		
		moves(n-1, true);
		if(forward)	System.out.println("enter " + n);
		else		System.out.println("exit " + n);
		moves(n-1, false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		moves(4, true);

	}

}
