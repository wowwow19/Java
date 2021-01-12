package chap02;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; // 연산자가 들어가 int로 변환됨
		
		int intValue1 = byteValue1 + byteValue2; // int형 변수에 담아야 함
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; // 연산자가 들어가 int로 변환됨
		int intValue2 = charValue1 + charValue2;
		
		System.out.println("유니코드 : " + intValue2);
		System.out.println("출력문자 : " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		String strValue = "A";
//		char var = (char) strValue;
//		char var3 = '';
		float var5 = 10;
		System.out.println(var5);
	}
}
