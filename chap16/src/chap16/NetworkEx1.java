package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("place-now.co.kr");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip);
		
		byte[] ipAddr = ip.getAddress();
		System.out.println(Arrays.toString(ipAddr));
		
		for(byte b : ipAddr) {
			System.out.print((b < 0 ? b + 256 : b) + ", ");
		}
		System.out.println();
		ip = InetAddress.getLocalHost();
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip);
		
		InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
		Arrays.asList(inetAddresses).forEach(System.out::println);
		// 로드밸런싱 : 요청을 여러 곳으로 분산
	}
}
