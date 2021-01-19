package chap07;

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();		// Heap영역에 인스턴스 생성
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World1");
		
		ctv.caption = true;
		ctv.displayCaption("Hello, World2");		
	}
}

class Tv {		// 부모클래스
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {	// 자식클래스
	boolean caption;
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
