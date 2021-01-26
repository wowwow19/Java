package chap09;

public class EqualsEx1 {
	public static void main(String[] args) {
		Object o = new Object();
		
		Value v1 = new Value(3);
		Value v2 = new Value(3);
		
		System.out.println(v1.equals(v2));	// 오버라이딩된 메서드를 통한 비교
		System.out.println(v1 == v2);		// 주소값 비교
		System.out.println(v1.equals(null));
		System.out.println(v1.equals(o));
		System.out.println(v1.equals(new Value(4)));
	}
}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		
		return obj != null &&
				obj instanceof Value && 
				value == ((Value)obj).value;
	}
}
