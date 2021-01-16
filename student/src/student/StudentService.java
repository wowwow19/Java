package student;

public class StudentService {
	// 학생에 대한 관리(필드)
		// 배열로 학생들을 관리
	Student[] students = new Student[10];
	int count;
	
	// 기능에 대한 관리(CRUD)
		// 학생 추가, 조회, 수정, 삭제
		// 학생 추가
	void add() {
		System.out.println("add()");
	}
		// 학생 조회
	void list() {
		System.out.println("list()");
	}
		// 학생 수정
	void modify() {
		System.out.println("modify()");
	}
		// 학생 삭제
	void remove() {
		System.out.println("remove()");
	}
}
