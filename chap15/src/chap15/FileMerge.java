package chap15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMerge {
	public static void main(String[] args) throws Exception {
		String mergeFileName = "tmp.dat";
		File tmpFile = File.createTempFile("~mergetmp", ".tmp");
		tmpFile.deleteOnExit();
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tmpFile));
		BufferedInputStream bis = null;
		
		int number = 1;
		
		File f = new File(mergeFileName + "_." + number);
		
		while(f.exists()) {
			f.setReadOnly();
			bis = new BufferedInputStream(new FileInputStream(f));
			
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			bis.close();
			f = new File(mergeFileName + "_." + ++number);
		}
		bos.close();
		File oldFile = new File(mergeFileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}
		tmpFile.renameTo(oldFile);
	}
}
