package chap15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class FileDownloader {
	public static void main(String[] args) throws IOException {
//		String urlString = "http://cdn.mydaily.co.kr/FILES/202102/202102100037102343_1.jpg";
		
		System.out.println("다운받을 이미지의 url을 입력하세요. > ");
		String urlString = new Scanner(System.in).nextLine();
		
		URL url = new URL(urlString);
		String fileName = url.getFile().substring(url.getFile().lastIndexOf("/")+1);
		String targetString = "/Users/user/Downloads/" + fileName;
		
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetString));
		
		int b;
		while ((b = bis.read()) != -1) {	// read() 한 번에 1byte씩
			bos.write(b);
		}
		bos.close();
	}
}
