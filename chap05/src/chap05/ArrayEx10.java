package chap05;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		int[] tmpNumArr = numArr.clone();
		for (int i = 0; i < tmpNumArr.length-1; i++) {
			boolean changed = false;
			for (int j = 0; j < tmpNumArr.length-1-i; j++) {
				if (tmpNumArr[j] > tmpNumArr[j+1]) {
					int tmp = tmpNumArr[j];
					tmpNumArr[j] = tmpNumArr[j+1];
					tmpNumArr[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
			for (int k = 0; k < tmpNumArr.length; k++) {
				System.out.print(tmpNumArr[k]);
			}
			System.out.println();
		}
	}
}
