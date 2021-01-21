package scenario.clothing;

public class ClothingService {
	public void list(Clothing[] clothings) {
		String[] listInfo = new String[] {
				"의류코드", "색상", "사이즈", "상하의", "원단", "계절"
		};
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println(ClothingUtils.getFormat(listInfo));
		System.out.println("------------------------------------------------------------------------------------------------");
		// 의류 내용을 출력할 수 있게 코드작성
		for (Clothing c : clothings) {
			System.out.println(ClothingUtils.getClothingInfo(c, true));
		}
	}
	
}
