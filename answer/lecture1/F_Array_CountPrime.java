package teaching.answer.lecture1;

public class F_Array_CountPrime {

	public static int countPrime(int N){
		int count = 0;
		
		boolean[] isPrime = new boolean[N+1];

		for(int i=2; i<isPrime.length; i++){
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<N; i++){
			if(isPrime[i]){
				for(int j=i; i*j<=N; j++){
					isPrime[i*j] = false;
				}
			}
		}
		
		for(int i=2; i<=N; i++){
			if(isPrime[i]) {
				count++;
				System.out.print(i + "	");
			}
		}
		
		System.out.println("\nThe number of primes <= " + N + " is " + count);
		return count;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 17;
		F_Array_CountPrime.countPrime(N);

	}

}
