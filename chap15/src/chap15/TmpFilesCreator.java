package chap15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TmpFilesCreator {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("tmp.dat"));
		for (int i = 0; i < 4_881_080; i++) {
			bos.write(0);
		}
		bos.close();
	}
}
