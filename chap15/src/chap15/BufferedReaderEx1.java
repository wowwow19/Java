package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chap15/BufferedReaderEx1.java");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		for (int i = 0; (line = br.readLine()) != null; i++) {
			if (line.indexOf(";") != -1) {			// 행에 ";"가 포함되어 있을 때 출력
				System.out.println(i + ":" + line);
			}
		}
		br.close();
	}
}
