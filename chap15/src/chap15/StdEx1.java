package chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StdEx1 {
	public static void main(String[] args) {
		try {
			int input = 0;
			InputStream is = System.in;
			while((input = is.read()) != -1) {
				System.out.println("input : " + input + ", (char)input : " + (char)input);
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
