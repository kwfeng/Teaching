package teaching.answer.lecture1;

public class I_Array_Minesweeper {

	/*
		Write a program that takes 3 arguments M, N, and p 
		and produces an M-by-N boolean array where each entry 
		is occupied with probability p. 
		In the minesweeper game, occupied cells represent 
		bombs and empty cells represent safe cells. Print out 
		the array using an asterisk for bombs and a period for 
		safe cells. 
		Then, replace each safe square with the number of 
		neighboring bombs (above, below, left, right, or 
		diagonal) and print out the solution.	 
	*/
	
	public static void startGame(int M, int N, double p){
		
		boolean[][] bombs = new boolean[M+2][N+2];
		for(int i=1; i<=M; i++){
			for(int j=1; j<=N; j++){
				bombs[i][j] = (Math.random()<p);
			}
		}
		
		for(int i=1; i<=M; i++){
			for(int j=1; j<=N; j++){
				if(bombs[i][j]) System.out.print(" *");
				else 			System.out.print(" .");
			}

			System.out.println();
		}
		
		int[][] sol = new int[M+2][N+2];
		for(int i=1; i<=M; i++){
			for(int j=1; j<=N; j++){
				for(int a=i-1; a<=i+1; a++){
					for(int b=j-1; b<=j+1; b++){
						if(bombs[a][b]) sol[i][j]++;
					}
				}
			}
		}
		
		System.out.println();
		for(int i=1; i<=M; i++){
			for(int j=1; j<=N; j++){
				if(bombs[i][j])	System.out.print("* ");
				else 				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 8;
		int N = 12;
		double p = 0.2;
		I_Array_Minesweeper.startGame(M, N, p);
	}

}
