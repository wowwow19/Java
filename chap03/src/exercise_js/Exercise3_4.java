package exercise_js;

public class Exercise3_4 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket;
		
		if (numOfApples % sizeOfBucket == 0) {
			numOfBucket = numOfApples / sizeOfBucket;
		} else {
			numOfBucket = numOfApples / sizeOfBucket + 1;
		}
		
		System.out.println((numOfApples + 9) / sizeOfBucket); // 더 간단한 식
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}
