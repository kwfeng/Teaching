package teaching.answer.lecture2;

public class A_Ruler {

	public static String print(String s, int N){
		
		if(N==1)
			return "1";
		else {
			String t = print(s, N-1);
			return t + " " + N + " " + t;
		}
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "";
		int N = 4;
		System.out.println(A_Ruler.print(s, N));

	}

}
