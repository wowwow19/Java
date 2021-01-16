package chap06;

public class TvArrayExample {
	public static void main(String[] args) {
//		TV tv = new TV();
		TV[] tvs = new TV[3];
//		TV[] tvs = {null, null, new TV()};		// 선언과 초기화를 동시에 하는 방법
		
		for (int i = 0; i < tvs.length; i++) {
			tvs[i] = new TV();
			tvs[i].channel = i + 10;
		}
		
		for (TV tv : tvs) {
			System.out.println(tv.channel);
		}
		
	}
}
