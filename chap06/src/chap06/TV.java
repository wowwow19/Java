package chap06;

public class TV {
	// 필드 (상태) : 인스턴스 변수
	// 전원, 채널, 볼륨
	boolean power;	// 초기화를 하지 않아도 자동 초기화가 됨
	int channel;
	int volume;
	
	// 메서드 (기능)
	// 메서드 시그니쳐 : 메서드 이름, 파라미터 갯수, 파라미터 타입
	// 전원, 채널변경, 볼륨조절
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	int getVolume() {
		return volume;
	}
}
