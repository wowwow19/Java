package chap05;

import java.util.Arrays;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		for (int i = 0; i < mathScores.length; i++) {			// mathScores.length = 2
			for (int j = 0; j < mathScores[i].length; j++) {		// mathScores[0].length = 3, mathScores[1].length = 3
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {			// englishScores.length = 2
			for (int j = 0; j < englishScores[i].length; j++) {	// englishScores[0].length = 2, englishScores[1].length = 3
				System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		
		for (int i = 0; i < javaScores.length; i++) {			// javaScores.length = 2
			System.out.println(Arrays.toString(javaScores[i]));
			for (int j = 0; j < javaScores[i].length; j++) {		// javaScores[0].length = 2, javaScores[1].length = 3
				System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
			}
		}
	}
}
