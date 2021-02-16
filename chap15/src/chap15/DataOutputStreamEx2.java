package chap15;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		
		dos.writeInt(10);
		dos.write(0);
		dos.write(0);
		dos.write(0);
		dos.write(10);
		dos.writeFloat(20.f);
		dos.writeBoolean(true);	// 01
		dos.writeChar('A');		// 00 41
		dos.writeChar('가');		// ac 00
		dos.writeChars("가");	// ac 00
		dos.writeUTF("가");		// ea b0 80
		
		byte[] result = baos.toByteArray();
		String[] hex = new String[result.length];
		
		for (int i = 0; i < result.length; i++) {
			if(result[i] < 0) {
				hex[i] = String.format("%02x", result[i]+256);
			} else {
				hex[i] = String.format("%02x", result[i]);
			}
		}
		
		System.out.println("10진수 : " + Arrays.toString(result));
		System.out.println("16진수 : " + Arrays.toString(hex));
	}
}
