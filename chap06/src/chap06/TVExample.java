package chap06;

public class TVExample {
	public static void main(String[] args) {
		TV tv1 = new TV();	// 객체 생성
		TV tv2 = new TV();
		
		System.out.println("tv1의 전원 : " + tv1.power);
		System.out.println("tv1의 채널 : " + tv1.channel);
		System.out.println("tv1의 볼륨 : " + tv1.volume);
		
		System.out.println("tv2의 전원 : " + tv2.power);
		System.out.println("tv2의 채널 : " + tv2.channel);
		System.out.println("tv2의 볼륨 : " + tv2.volume);
		
		// 메서드 호출
		tv1.power();		// tv1의 전원 켜기
		tv1.channelUp();	// tv1의 채널 올리기
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();		// tv1의 볼륨 올리기
		tv1.volumeUp();
		
		tv2.power = true;	// 필드값 직접 변경
		tv2.channel = 10;
		tv2.volume = 15;
		
		System.out.println("tv1의 전원 : " + tv1.power);		// true
		System.out.println("tv1의 채널 : " + tv1.channel);	// 3
		System.out.println("tv1의 볼륨 : " + tv1.volume);		// 2

		System.out.println("tv2의 전원 : " + tv2.power);		// false
		System.out.println("tv2의 채널 : " + tv2.channel);	// 0
		System.out.println("tv2의 볼륨 : " + tv2.volume);		// 0

	}
}
