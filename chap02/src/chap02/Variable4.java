package chap02;

public class Variable4 {

	public static void main(String[] args) {
		// 변수의 타입
		// bit : 정보기억의 최소단위(0, 1)
		// 1byte : 8bit
		
		// byte(1byte), short(2byte), int(4byte), long(8byte)
		
		// byte
		// 0000 0000(2) ~ 1111 1111(2) >> -128 ~ 127
		// 0(최상위비트)000 0000 : 부호를 결정(0:양수, 1:음수)
		
		// 음수 저장
		// 2의 보수 표기법
		// -2
		// 1 000 0010 : 부호와 절대값으로 표현
		// 1 111 1101 : 절대값을 1의 보수로 변환
		// 1 111 1110 : 1을 더해줌 
		
		// int : 부호비트 1개, 31개의 절대값 비트
		// long : 부호비트 1개, 63개의 절대값 비트
		System.out.println(Integer.toBinaryString(-2));
	}

}
