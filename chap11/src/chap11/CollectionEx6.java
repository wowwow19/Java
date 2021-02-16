package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionEx6 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			integers.add((int)(Math.random()*10+1));
		}
		System.out.println(integers);
		Collections.sort(integers);
		System.out.println(integers);
		
		// 익명 클래스 이용
		Collections.sort(integers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;	// 오름차순
				return o2 - o1;	// 내림차순
			}
			
		});
		
		// 객체 변수 선언을 이용
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;	// 오름차순
				return o2 - o1;	// 내림차순
			}
		};
		
		Collections.sort(integers, c);
		System.out.println(integers);
		
//		Collections.sort(integers, new MyCompa());
	}
	
	class MyCompa implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
//			return o1 - o2;	// 오름차순
			return o2 - o1;	// 내림차순
		}
	}
}
