package chap09;

import java.net.MalformedURLException;
import java.net.URL;

public class StringEx {
	public static void main(String[] args) throws MalformedURLException {
//		String str = new String(new char[]{'안', '녕'});
//		System.out.println(str);
//		
//		long start = System.currentTimeMillis();
//		StringBuffer sb = new StringBuffer();	// 변경사항이 많을 경우 사용
////		String s = "";
//		for(int i = 0; i < 100_000; i++) {
////			s += "0";
//			sb.append("0");
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start + "ms");
//		System.out.println(sb.length());
//		String s = new String(sb);
		
		String url = "https://search.naver.com/search.naver?" + 
					"where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
//		
//		String[] urls = url.split("/");
//		for (int i = 0; i < urls.length; i++) {
//			System.out.println("urls[" + i + "] : " + urls[i]);
//		}
//		
//		String protocol = urls[0].substring(0, urls[0].indexOf(':'));
//		String domain = urls[2];
//		
//		String[] urls2 = urls[3].split("\\?");
//		String fileName = urls2[0];
//		String[] queryString = urls2[1].split("&");
//				
//		System.out.println("프로토콜 : " + protocol);
//		System.out.println("도메인 : " + domain);
//		System.out.println("파일명 : " + fileName);
//		for(int i = 1; i < queryString.length; i++) {
//			System.out.println("쿼리스트링" + i + " : " + queryString[i]);			
//		}
		
		URL url2 = new URL(url);
		System.out.println(url2.getProtocol());
		System.out.println(url2.getHost());
		System.out.println(url2.getPath());
		System.out.println(url2.getQuery());
	}
}
