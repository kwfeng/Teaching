package teaching.answer.lecture1;

import teaching.util.ArrayUtil;

public class G_Array_Goldbach {

	public static void printGoldbach(int N){
		boolean[] isPrime = new boolean[N+1];
		
		for(int i=2; i<=N; i++){
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<N; i++){
			for(int j=i; j*i<=N; j++){
				isPrime[i*j] = false;
			}
		}
		
		int primeCount = 0;
		for(int i=2; i<=N; i++){
			if(isPrime[i]) primeCount++;
		}
		
		// store primes in list
		int[] list = new int[primeCount];
		int n=0;
		for(int i=2; i<=N; i++){
			if(isPrime[i])
				list[n++] = i;
		}

		int i = 0;
		int j = primeCount-1;
		
		while(i<j){
			if(list[i]+list[j]==N){
				System.out.println( N + " = " + list[i] + " + " + list[j]);
				i++; j--;
			}
			else if(list[i]+list[j]<N)
				i++;
			else
				j--;
		}
	}

	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		
		ArrayUtil.print2D(matrix);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// G_Array_Goldbach.printGoldbach(2000000);
		int N = 4;
		int[][] matrix = ArrayUtil.generateSeq2DArray(N);
		rotate(matrix, N);
	}

}
