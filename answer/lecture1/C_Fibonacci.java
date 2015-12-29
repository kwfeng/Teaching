package teaching.answer.lecture1;

public class C_Fibonacci {

	private long fibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	private long fibonacci(long fibCurrent, long fibPrevious, int n){
		if(n==1){
			return fibCurrent;
		} else{
			return fibonacci(fibCurrent+fibPrevious, fibCurrent, n-1);
		}
	}

	private long fibonacciIterative(int n){
		long a = 0, b = 1;
		for(int i=0; i<n; i++){
			a = a+b;
			b = a-b;
		}
		
		return a;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C_Fibonacci f = new C_Fibonacci();
		
		int N = 10;

		long startTime = System.currentTimeMillis();
		System.out.println(f.fibonacci(N));
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(estimatedTime);
		
		startTime = System.currentTimeMillis();
		System.out.println(f.fibonacci(1, 0, N));
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(estimatedTime);

	}

}
