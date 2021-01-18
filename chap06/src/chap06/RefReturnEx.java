package chap06;

public class RefReturnEx {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 20;
		Data d2 = copy(d1);
		
		System.out.println(d1.x);
		System.out.println(d2.x);
		System.out.println(d1);
		System.out.println(d2);
		
		// copy : 복사(외부 주소를 복사)
			// shallow copy
			// deep copy
		// clone : 복제(새 객체 생성 후 내부의 값을 복사)
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}
