package chap09;

public class AddrTest2 {
	public static void main(String[] args) {
		Addr addr1 = new Addr("강영훈", "010-0000-0000");
		Addr addr2 = new Addr("전민우", "010-0000-0001");
		Addr addr3 = addr1;
		
		addr1.setPhone("010-0000-0002");
		System.out.println(addr1.getPhone());
		System.out.println(addr3.getPhone());
		
		Addr addr4 = addr2.clone();
		addr2.setPhone("010-0000-0003");
		System.out.println(addr2.getPhone());
		System.out.println(addr4.getPhone());
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1.clone();
		
	}
}
