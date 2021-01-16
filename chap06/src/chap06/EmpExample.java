package chap06;

public class EmpExample {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		
		e1.empNo = 7369;
		e1.ename = "SMITH";
		e1.job = "CLERK";
		e1.sal = 800;
		e1.deptNo = 20;
		
		System.out.println(e1);
	}
}
