package chap15.serial;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
	public static void main(String[] args) throws Exception {
		String fileName = "UserInfo.ser";
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
		
		UserInfo u1 = new UserInfo("javaman", "1234", 30);
		UserInfo u2 = new UserInfo("javawoman", "4321", 26);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		oos.writeObject(u1);
		oos.writeObject(u2);
		oos.writeObject(list);
		oos.close();
		System.out.println("직렬화가 끝났습니다.");
	}
}
