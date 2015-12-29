package teaching.answer.lecture1;

import teaching.util.ArrayUtil;

public class H_Array_MagicSquare {

	public static int[][] generate(int N){
		int[][] magic = new int[N][N];
		
		int row = N-1;
		int col = N/2;
		
		magic[row][col] = 1;
		
		for(int i=2; i<=N*N; i++){
			int tryRow = (row+1) % N;
			int tryCol = (col+1) % N;
			
			if(magic[tryRow][tryCol]==0){
				row = tryRow;
				col = tryCol;
			} else {
				row = (row-1+N) % N;
			}
			magic[row][col] = i;
		}
		return magic;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 3;
		int[][] magic = H_Array_MagicSquare.generate(N);
		ArrayUtil.print2D(magic);

	}

}
