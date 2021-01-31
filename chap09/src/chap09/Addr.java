package chap09;

// 비즈니스 로직 : 전화번호는 유일해야 함
public class Addr implements Cloneable, Comparable<Addr> {
	private String name;	// 이름
	private String phone;	// 전화번호
	
	public Addr() {}
	
	public Addr(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Addr [name=" + name + ", phone=" + phone + "]";
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
//		if(obj != null && obj instanceof Addr) {
//			return phone == ((Addr)obj).phone;
//		} else {
//			return false;
//		}
		return obj != null && 
				obj instanceof Addr && 
				phone == ((Addr)obj).phone;
	}

	@Override
	public Addr clone() {
		Addr addr = null;
		try {
			addr = (Addr)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return addr;
	}

	@Override
	public int compareTo(Addr o) {
		return name.compareTo(o.name);
	}
	
}
