package chap15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		String fileName = "test.txt";
		FileInputStream fis = new FileInputStream(fileName);	// 바이트기반
		FileReader fr = new FileReader(fileName);				// 문자기반
		
		int data = 0;
		int count = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
			count++;
		}
		System.out.println(" :: " + count + "byte 읽음");
		fis.close();
		
		count = 0;
		while((data = fr.read()) != -1) {
			System.out.print((char)data);
			count++;
		}
		System.out.println(" :: " + count + "문자 읽음");
		fr.close();
	}
}
