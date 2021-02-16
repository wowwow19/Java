package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionEx5 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(2);
		
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Integer i : arrayList) {
			System.out.println(i);
		}
		
		int[] arr = new int[5];
		Arrays.setAll(arr, (a) -> (int)(Math.random() * 5) + 1);
		System.out.println(Arrays.toString(arr));
		
	}
}
