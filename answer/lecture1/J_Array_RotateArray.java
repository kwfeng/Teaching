package teaching.answer.lecture1;

import teaching.util.ArrayUtil;

public class J_Array_RotateArray {

	public static void rotate(int[][] matrix, int n) {
	
		int[][] result = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				result[j][n-1-i] = matrix[i][j];
			}
		}
		ArrayUtil.print2D(result);
	}
	
	
	public static void generatePascal(int n){
		int[][] a = new int[n+1][];
		
		a[1] = new int[3]; // 0 1 0
		a[1][1] = 1;
		
		for(int i=2; i<=n; i++){
			a[i] = new int[i+2];
			for(int j=1; j<i+1; j++){
				a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<a[i].length-1; j++){
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int N = 6;
//		int[][] matrix = ArrayUtil.generateSeq2DArray(N);
//		rotate(matrix, N);
//		generatePascal(N);
		
		int N = 1000;
		int[] a = new int[N*N*N*N];
	}

}
