package chap15.serial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {
	public static void main(String[] args) throws Exception {
		String fileName = "UserInfo.ser";
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
		
		UserInfo u1 = (UserInfo)ois.readObject();
		UserInfo u2 = (UserInfo)ois.readObject();
		ArrayList list = (ArrayList)ois.readObject();
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(list);
		ois.close();
	}
}
