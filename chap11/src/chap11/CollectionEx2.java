package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		// 조회 : get(index)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 수정 : set(index, value)
		list.set(2, 80);
		System.out.println(list);
		
		// 추가 : add(value), add(index, value)
		list.add(2, 90);
		System.out.println(list);
		
		// 삭제 : remove(index)
		list.remove(0);
		System.out.println(list);
		
		// 데이터 중복 가능
		list.add(50);
		System.out.println(list);
		
		// 값의 위치 탐색 : indexOf(value)
		System.out.println(list.indexOf(50));
		// 마지막 인덱스부터 탐색 : lastIndexOf(value)
		System.out.println(list.lastIndexOf(50));
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("둘리");
		list2.add("도우너");
		list2.add("또치");
		list2.add("고길동");
		list2.add("희동이");
		
		System.out.println(list2);
		
		list2.remove(3);
		System.out.println(list2);
		list2.remove("둘리");
		System.out.println(list2);
		
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list3 = Arrays.asList(arr);
		System.out.println(list3);
	}
}
