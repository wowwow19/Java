package chap05;

public class MultiArrayExample {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];					// 2행 3열의 다차원 배열 생성
		int[][] arr2 = {{10, 20}, {30, 40, 50}};		// 2행 2열의 다차원 배열 생성과 초기화
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		// arr2.length = 2
		// arr2[0].length = 2
		// arr2[1].length = 3
		
		int[][] arr3 = new int[2][];					// 2행인 arr3 배열 생성
		arr3[0] = new int[3];						// 1행에 3열짜리 배열 생성
		arr3[1] = new int[2];						// 2행에 2열짜리 배열 생성
	}
}
