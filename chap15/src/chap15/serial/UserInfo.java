package chap15.serial;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/**
	 * 직렬화시 포함된 필드
	 * name, password, age
	 */
	private static final long serialVersionUID = 1348362370342145473L;
	String name;
	String password;
	int age;
	String addr;

	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
