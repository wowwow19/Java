package project;

import java.util.Scanner;
import static project.Data.*;

public class Utils {
	static Scanner scanner = new Scanner(System.in);
	
	public static int nextInt() {
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static String nextLine() {
		return scanner.nextLine();
	}
	
	public static void logInRegistBar() {
		System.out.println("-------------------");
		System.out.println("1. 로그인 | 2. 회원가입");
		System.out.println("-------------------");
		System.out.print("선택 > ");			
	}
	
	public static void menuBar() {
		System.out.println("--------------------------------------------------------");
		System.out.println("1. 관광지목록 | 2. 지역별검색 | 3. 즐겨찾기 | 4. 로그아웃 | 5. 종료");
		System.out.println("--------------------------------------------------------");
		System.out.print("선택 > ");
	}
	
	public static boolean login() {
		System.out.println("로그인합니다.");
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		System.out.print("아이디 > ");
		String id = nextLine();
		System.out.print("패스워드 > ");
		String pw = nextLine();
		
		for (int i = 0; i < getUserNum(); i++) {
			if (id.equals(getUsers()[i].getId())) {
				if (pw.equals(getUsers()[i].getPw())) {
					System.out.println("로그인 성공");
					return true;
				}
			}
		}
		System.out.println("잘못입력하셨습니다.");
		return false;
	}
	
	public static void register() {
		System.out.println("계정을 생성합니다.");
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		System.out.print("아이디 > ");
		String id = nextLine();
		System.out.print("패스워드 > ");
		String pw = nextLine();

		getUsers()[getUserNum()] = new User(id, pw);
	}
	
}
