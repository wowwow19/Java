package chap15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardIOEx3 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new FileOutputStream("std_test.txt"));
		System.setOut(ps);
		
		System.out.println("헬로우 월드");
		System.err.println("헬로우 월드");
		
	}
}
