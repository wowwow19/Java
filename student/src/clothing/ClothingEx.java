package clothing;

import org.apache.commons.lang3.StringUtils;

// 의류 : 코드(정수), 색상(문자열), 사이즈(문자열), 상하의(불린), 원단(문자열), 계절(문자열)
public class ClothingEx {
	public static void main(String[] args) {
		// 1-1 : 클래스 멤버변수 생성하기
		// 1-2 : 멤버변수에 접근제어자를 통한 캡슐화 적용
		// 1-3 : 클래스 배열생성, 각 객체 생성 후 적용
		// 2-1 : 각 항목에 대한 주석 작성
		// 2-2 : 서비스 객체 생성 후 조회코드 호출
		// 2-3 : 제안된 예시대로 데이터를 반영 후 출력
		// 3-1 : 외부 라이브러리 검색
		// 3-2 : 라이브러리 불러오기
		// 3-3 : 라이브러리 반영하기
		
		// 10001		RED		M	true	면		봄
		// 10002		BLUE	L	true	면		여름
		// 10003		BLACK	XL	true	나일론	여름
		// 10004		PINK	M	true	면		가을
		// 10005		RED		S	false	면		겨울
		
	}
}

// Component = Value Object = Data Transfer Object
class Clothing {
	private int code;			// 의류코드
	private String color;		// 색상
	private String size;			// 사이즈
	private boolean top;		// 상하의 구분
	private String material;		// 원단
	private String season;		// 계절
	
	public Clothing() {}
	
	public Clothing(int code, String color, String size, boolean top, String material, String season) {
		super();
		this.code = code;
		this.color = color;
		this.size = size;
		this.top = top;
		this.material = material;
		this.season = season;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isTop() {
		return top;
	}
	public void setTop(boolean top) {
		this.top = top;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}	
}

class ClothingService {
	// 조회기능
	public void list(Clothing[] clothings) {
		String[] listInfo = new String[] {
				"의류코드", "색상", "사이즈", "상하의", "원단", "계절"
		};
		System.out.println("------------------------------------------------");
		System.out.println(ClothingUtils.getFormat(listInfo));
		System.out.println("------------------------------------------------");
	}
	
	public static void main(String[] args) {
		new ClothingService().list(null);
	}
	
}

class ClothingUtils {
	// 의류 항목이 길어질 때 축약 출력 기능
	public static String getClothingInfo(Clothing clothing, boolean isShort) {
		String[] strs = {
				clothing.getCode() + "", clothing.getColor(),
				clothing.getSize(), clothing.isTop() + "",
				clothing.getMaterial(), clothing.getSeason()
				
		};
		if (isShort) strs = subContent(strs, 3);
		return getFormat(strs);
	}
	
	// 출력시 사용할 텍스트량 조절
	public static String getFormat(String[] strs) {
		String ret = "";
		for (String str : strs) {
			char[] words = str.toCharArray();
			int cnt = 20;
			for (char c : words) {
				if (c >= '가' && c <= '힣') {
					cnt--;
				}
			}
			ret += "%-" + cnt + "s";
		}
		return String.format(ret, (Object[])strs);
	}
	
	// 한글 5글자 초과할 때 말줄임표 붙이기
	public static String[] subContent(String[] strs, int lastIdx) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() > 10 && isKorean(strs[i])) {
				strs[i] = StringUtils.substring(strs[i], 0, 9) + "..";
			}
		}
		return strs;
	}
	
	// 한글여부 체크(한글자라도 한글이 포함되면 한글로 인식)
	public static boolean isKorean(String str) {
		boolean ret = false;
		for (char c : str.toCharArray()) {
			if (c >= '가' && c <= '힣') {
				ret = true;
			}
		}
		return ret;
	}
}
