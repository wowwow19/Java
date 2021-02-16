package chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class InputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://ncs.go.kr/index.do");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String input = "";
		
		for (int i = 1; (input = br.readLine()) != null; i++) {
			System.out.println(i + " ::: " + input);
		}
//		while ((input = br.readLine()) != null) {
//			System.out.println(input);
//		}
		br.close();
	}
}
