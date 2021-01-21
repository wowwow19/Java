package chap07_4;

public class RunnerTest {
	public static void main(String[] args) {
		Runnable runner1 = new Runner();
		runner1.run();
		
		Runnable runner2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("runner2.run()");
			}
		};
		
		runner2.run();
		
		Runnable runner3 = new Runner().getRunner();
		runner3.run();
		
		AbsClass ab = new AbsClass() {};	// 익명클래스로는 추상클래스 인스턴스 생성가능
	}
}

interface Runnable {
	void run();
}

abstract class AbsClass {
	
}

class Runner implements Runnable {
	public void run() {
		System.out.println("Runner.run()");
	}
	
	public Runnable getRunner() {
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("getRunner().run()");
			}
		};
	}
}
