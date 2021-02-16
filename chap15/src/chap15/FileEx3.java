package chap15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileEx3 {
	static int totalFiles;
	static int totalDirs;
	
	public static void main(String[] args) {
		String dirName = "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home";
		File dir = new File(dirName);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}
		
		printFileList(dir);
		
		System.out.println("총 " + totalFiles + "개의 파일");
		System.out.println("총 " + totalDirs + "개의 디렉토리");
	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + "디렉토리");
		File[] files = dir.listFiles();
		
		ArrayList<String> subDir = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm");
		
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			String attr = "";
			String size = "";
			if(files[i].isDirectory()) {
//				fileName = "[" + fileName + "]";
				subDir.add(i + "");
				attr = "DIR";
			} else {
				size = files[i].length() + "";
				attr += files[i].canRead() ? "R" : " ";
				attr += files[i].canWrite() ? "W" : " ";
				attr += files[i].isHidden() ? "H" : " ";
			}
			System.out.println(String.format("%s %3s %6s %s", sdf.format(new Date(files[i].lastModified())), attr, size, fileName));
//			System.out.println(fileName);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
		System.out.println();
		
		for (int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}
}
