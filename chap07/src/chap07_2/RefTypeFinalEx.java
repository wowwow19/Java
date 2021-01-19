package chap07_2;

import java.util.Arrays;

public class RefTypeFinalEx {
	public static void main(String[] args) {
		final int[] arr = {10, 20, 30};
		arr[0] = 50;
		arr[0] = 30;
		System.out.println(Arrays.toString(arr));
//		arr = new int[5];	// 주소값을 변경할 수 없게 됨
	}
}
