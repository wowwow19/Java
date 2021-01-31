package chap09;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class AddrSortEx {
	public static void main(String[] args) {
		String[] strs = {"A", "C", "E", "B", "D"};
		Arrays.sort(strs);
		
		System.out.println(Arrays.toString(strs));
		
		Addr[] addrs = new Addr[3];
		addrs[0] = new Addr("둘리", "010-0000-0001");
		addrs[1] = new Addr("도우너", "010-0000-0002");
		addrs[2] = new Addr("또치", "010-0000-0003");
		
		System.out.println(Arrays.toString(addrs));
		
		Arrays.sort(addrs);
		System.out.println(Arrays.toString(addrs));
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(0));
		
		Date christmas = new Date(121, 11, 25);
		Date now = new Date(System.currentTimeMillis());
		
		System.out.println(christmas);
		System.out.println(now);
		
		System.out.println(christmas.getTime());
		System.out.println(now.getTime());
		
		long remain = christmas.getTime() - now.getTime();
		System.out.println(remain / 1000 / 60 / 60 / 24);
		
		System.out.println(new Random(0).nextDouble());
	}
}
