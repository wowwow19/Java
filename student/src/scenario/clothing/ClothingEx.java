package scenario.clothing;

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
		// 10002		BLUE	L	true	폴리		여름
		// 10003		BLACK	XL	true	나일론	여름
		// 10004		PINK	M	true	가죽		가을
		// 10005		RED		S	false	면		겨울
		
		// 의류 데이터를 담을 배열 생성
		Clothing[] clothings = new Clothing[5];
		int count = 0;
		// 각 배열 위치에 의류 객체 생성 후 대입
		clothings[count++] = new Clothing(10001, "RED", "M", true, "면", "봄");
		clothings[count++] = new Clothing(10002, "BLUE", "L", true, "폴리", "여름");
		clothings[count++] = new Clothing(10003, "BLACK", "XL", true, "나일론", "여름");
		clothings[count++] = new Clothing(10004, "PINK", "M", true, "가죽", "가을");
		clothings[count++] = new Clothing(10005, "RED", "S", false, "면", "겨울");
		
		// 기능 조회를 위한 서비스 객체 생성
		ClothingService service = new ClothingService();
		service.list(clothings);
	}
}
