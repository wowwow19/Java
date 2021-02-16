package chap15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"));
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
