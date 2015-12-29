package teaching.util;

public class ArrayUtil {

	public static int[] generateSequenceArray(int N){
		int[] array = new int[N];
		// TODO
		
		return array;
	}

	public static void printArray(int[] array){
		for(int a: array){
			System.out.println(a);
		}
	}
	
	public static int[][] generateSeq2DArray(int N){
		int[][] a = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				a[i][j] = 1 + N*i + j;
			}
		}
		return a;
	}
	
	public static int[][] generateSeq2DArray(int N, int M){
		int[][] a = new int[N][M];
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				a[i][j] = 1 + N*i + j;
			}
		}
		return a;
	}
	
	public static void print2D(int[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10;
		int[] array = ArrayUtil.generateSequenceArray(N);
		ArrayUtil.printArray(array);
	}

}
