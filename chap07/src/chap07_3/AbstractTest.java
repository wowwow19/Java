package chap07_3;

public class AbstractTest {
	public static void main(String[] args) {
		Emp[] emps = new Emp[3];
		emps[0] = new Programmer();
		emps[1] = new Designer();
		emps[2] = new PlannerSub();
		
		// 다형성으로 제작
		
		for (Emp emp : emps) {
//			if (emp instanceof Programmer) {
//				((Programmer)emp).work();
//			} else if (emp instanceof Designer) {
//				((Designer)emp).work();
//			}
			emp.work();
		}
	}
}

// 사원 클래스
// 프로그래머, 디자이너 클래스
abstract class Emp {
	abstract void work();
}

class Programmer extends Emp {
	void work() {
		System.out.println("프로그래머가 개발을 합니다.");
	}
}

class Designer extends Emp {
	void work() {
		System.out.println("디자이너가 디자인을 합니다.");
	}
}

abstract class Planner extends Emp {
}

class PlannerSub extends Planner {
	void work() {
		System.out.println("기획자의 자손 인스턴스가 기획을 합니다.");
	}
}