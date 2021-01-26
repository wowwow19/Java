package chap09;

public class AddrTest {
	public static void main(String[] args) {
		AddrService service = new AddrService();
		service.add(new Addr("김기영", "010-0000-0000"));
		service.add(new Addr("구본희", "010-0000-0001"));
		service.add(new Addr("신세영", "010-0000-0002"));
		service.add(new Addr("김소연", "010-0000-0003"));
		service.add(new Addr("김보경", "010-0000-0001"));
		
		service.list();
	}
}

