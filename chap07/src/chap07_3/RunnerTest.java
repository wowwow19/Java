package chap07_3;

public class RunnerTest {
	public static void main(String[] args) {
		Runner runner = new Runner();
		Runnable runner2 = new Runner();
		
	}
}

class Runner implements Runnable {		// 오버라이드 주의사항 : 인터페이스 메서드의 접근제한자와 같거나 그 이상이어야 함

	@Override
	public void run() {
		System.out.println("run!");
	}
	
}