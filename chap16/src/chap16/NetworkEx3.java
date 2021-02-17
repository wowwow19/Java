package chap16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
	public static void main(String[] args) throws Exception {
		URLConnection conn = new URL("https://www.naver.com").openConnection();
		System.out.println(conn);
		System.out.println(conn.getHeaderFields());
		InputStream is = conn.getInputStream();
//		OutputStream os = conn.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String str = null;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("naver.html"));
		while((str = br.readLine()) != null) {
			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		
		br.close();
	}
}
