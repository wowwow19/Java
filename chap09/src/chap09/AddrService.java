package chap09;

public class AddrService {
	private Addr[] addrs = new Addr[5];
	private int count;
	
	// 전화번호부 등록
	public void add(Addr addr) {
		for (int i = 0; i < count; i++) {
			if(addrs[i].equals(addr)) {
				System.out.println("전화번호 중복");
				return;
			}
		}
		addrs[count++] = addr;
	}
	
	// 전화번호부 조회
	public void list() {
		for (int i = 0; i < count; i++) {
			System.out.println(addrs[i].getName() + ":" + addrs[i].getPhone());
		}
	}
}
