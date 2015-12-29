package teaching.answer.lecture1;

import teaching.util.ArrayUtil;

public class D_Array_ShuffleCard {

	public static int[] shuffleCards(int N){
		int[] a = ArrayUtil.generateSequenceArray(N);
		// TODO

		return a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10;
		int[] random = D_Array_ShuffleCard.shuffleCards(N);
		ArrayUtil.printArray(random);
	}

}
