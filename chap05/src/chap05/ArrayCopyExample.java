package chap05;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		System.out.println(Arrays.toString(oldIntArray));
		System.out.println(Arrays.toString(newIntArray));
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, 3);
		
		System.out.println();
		System.out.println(Arrays.toString(oldIntArray));
		System.out.println(Arrays.toString(newIntArray));
	}
}
