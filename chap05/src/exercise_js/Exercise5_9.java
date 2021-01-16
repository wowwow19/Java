package exercise_js;

public class Exercise5_9 {
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length]; // char[5][4]
		
		for(int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
//				result[j][i] = star[i][j];
				result[j][3-i] = star[i][j];			// star의 행 -> result의 열, star의 열 역순
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
	}
}
