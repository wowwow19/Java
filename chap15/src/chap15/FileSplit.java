package chap15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplit {
	public static void main(String[] args) throws IOException {
		int unit = 1000;
		final int VOLUME = unit * 1000;	// 1_000_000 bytes
		String fileName = "tmp.dat";
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
		BufferedOutputStream bos = null;
		
		int data = 0;
		int i = 0;
		int number = 0;
		
		while((data = bis.read()) != -1) {
			if(i % VOLUME == 0) {
				if(i != 0) {
					bos.close();
				}
				bos = new BufferedOutputStream(new FileOutputStream(fileName + "_." + ++number));
			}
			bos.write(data);
			i++;
		}
		
		bis.close();
		bos.close();
		
	}
}
