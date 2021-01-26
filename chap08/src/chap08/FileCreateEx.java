package chap08;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateEx {
	public static void main(String[] args) {
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("abc.txt");
//			fw.write("동해물과 백두산이 마르고 닳도록\r\n");
//			fw.write("하느님이 보우하사 우리나라만세\r\n");
//			fw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fw.close();
//			} catch (Exception ignore) {
//			}
//		}
		try(FileWriter fw = new FileWriter("def.txt")){	// 자동으로 반환
			fw.write("동해물과 백두산이 마르고 닳도록\r\n");
			fw.write("하느님이 보우하사 우리나라만세\r\n");
			fw.flush();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
