package chap05;

import java.util.Arrays;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		System.out.println(Arrays.toString(oldIntArray));
		System.out.println(Arrays.toString(newIntArray));
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		System.out.println();
		System.out.println(Arrays.toString(oldIntArray));
		System.out.println(Arrays.toString(newIntArray));
	}
}
