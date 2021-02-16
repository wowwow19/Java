package chap15;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f = new File("/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home");
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.canExecute());
		
		System.out.println(f.toPath());
		
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
		
		
	}
}
