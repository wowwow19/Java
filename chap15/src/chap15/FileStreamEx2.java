package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx2 {
	public static void main(String[] args) throws IOException {
		// 파일 복사 구현하기
		FileInputStream fis = new FileInputStream("/Users/user/Downloads/target.txt");
		FileOutputStream fos = new FileOutputStream("/Users/user/Downloads/target2.txt");
		
		byte[] bArr = new byte[8];
//		fis.read(bArr);
//		System.out.println(Arrays.toString(bArr));
//		System.out.println(fis.available());
//		
//		bArr = new byte[8];
//		fis.read(bArr);
//		System.out.println(Arrays.toString(bArr));
//		
//		bArr = new byte[8];
//		fis.read(bArr);
//		System.out.println(Arrays.toString(bArr));
//		
//		bArr = new byte[8];
//		fis.read(bArr);
//		System.out.println(Arrays.toString(bArr));
//		
//		bArr = new byte[8];
//		fis.read(bArr);
//		System.out.println(Arrays.toString(bArr));
		
		while(fis.available() > 0) {
			int len = fis.read(bArr);
			fos.write(bArr,0, len);
		}
		
		fis.close();
		fos.close();
		
	}
}
