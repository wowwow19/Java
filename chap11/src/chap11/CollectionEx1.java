package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEx1 {
	public static void main(String[] args) {
		System.out.println();
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<>();
		
		list.add(new Integer(3));
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(7);
		
		System.out.println(list);
		
		// list의 0번 인덱스 값부터 3번 미만의 인덱스 값까지를 list3 객체 생성하여 담기
		List<Integer> list3 = new ArrayList<>(list.subList(0, 3));
		
		// 다형성 : 조상클래스(인터페이스)로 선언, 자손클래스의 인스턴스를 사용
		System.out.println(list3);
		
		Collections.sort(list);
		Collections.sort(list3);
		
		System.out.println(list);
		System.out.println(list3);
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		System.out.println();
		System.out.println(list);
		System.out.println(list3);
		
		// list의 내부내용이 변경
//		list.removeAll(list3);	// 차집합
//		list.addAll(list3);		// 합집합(교집합 중복허용)
//		list.retainAll(list3);	// 교집합
		
		System.out.println();
		System.out.println(list);
		System.out.println(list3);
	}
}
