package chap15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample.txt");
			dos = new DataOutputStream(fos);
			dos.writeInt(Integer.MIN_VALUE);		// 정수 작성
			dos.writeFloat(20.0f);	// 실수 작성
			dos.writeBoolean(true);	// boolean 작성
			dos.writeLong(10);
			
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
