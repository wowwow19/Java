package chap11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionEx7 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("딸기");
		set1.add("사과");
		
		set2.add("사과");
		set2.add("멜론");
		set2.add("바나나");
		
		System.out.println(set1);
		System.out.println(set2);
		
		Set<String> result;
		
		result = new HashSet<>(set1);	// 합집합
		result.addAll(set2);
		System.out.println(result);
		
		result = new HashSet<>(set1);	// 차집합
		result.removeAll(set2);
		System.out.println(result);
		
		result = new HashSet<>(set1);	// 교집합
		result.retainAll(set2);
		System.out.println(result);
		
		Set<Integer> set = new HashSet(Arrays.asList(new Integer[] {1, 2, 3, 1 ,2 ,1 ,1, 3, 3, 2, 1, 2, 3, 6, 7, 3, 4, 4, 5, 2}));
		System.out.println(set);
		
	}
}
