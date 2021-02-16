package student;

import static student.StudentUtils.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
	// 학생에 대한 관리(필드)
		// 배열로 학생들을 관리
//	static Student[] students = new Student[10];
//	static int count = 0;
	static List<Student> students = new ArrayList<>();
	
		// 초기화 블럭에 더미데이터 입력
	{
		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("stu.ser")));			
			students = (List<Student>) ois.readObject();
			ois.close();
		} catch(FileNotFoundException e) {
			students.add(new Student(1, "둘리", 60, 70, 85));
			students.add(new Student(2, "도우너", 88, 92, 82));
			students.add(new Student(3, "또치", 82, 81, 92));
			students.add(new Student(4, "고길동", 65, 91, 49));
			students.add(new Student());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 기능에 대한 관리(CRUD)
		// 학생 추가, 조회, 수정, 삭제
		// 학생 추가
	void add() {
		System.out.print("학번 > ");
		int num = nextInt();
		System.out.print("이름 > ");
		String name = nextLine();
		System.out.print("국어점수 > ");
		int kor = nextInt();
		System.out.print("영어점수 > ");
		int eng = nextInt();
		System.out.print("수학점수 > ");
		int math = nextInt();
		
		students.add(new Student(num, name, kor, eng, math));
		
		save();
		System.out.println("메뉴를 다시 선택하세요.");
	}
		// 학생 조회
	void list() {
		printTopBar();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
		// 학생 수정
	void modify() {
		int choice = 0;
		int idx = 0;
		
		do {
			do {
				System.out.print("수정할 데이터의 학번을 입력하세요. > ");
				idx = findByNo(nextInt());				
				if (idx == -1) {
					System.out.println("찾을 수 없습니다.");
				}
			} while (idx == -1);
			
			
			System.out.print("찾는 데이터가 맞습니까? 1. 예 2. 아니오 3. 종료 > ");
			choice = nextInt();
			
			if (choice == 3) {
				return;
			}
		} while (choice == 2);
		
		System.out.println("데이터를 다시 입력합니다.");
		updateData(idx);
		save();
		System.out.println("수정이 완료되었습니다.");
	}
		// 학생 삭제
	void remove() {
		int choice = 0;
		int idx = 0;
		
		do {
			do {
				System.out.print("삭제할 데이터의 학번을 입력하세요. > ");
				idx = findByNo(nextInt());				
				if (idx == -1) {
					System.out.println("찾을 수 없습니다.");
				}
			} while (idx == -1);
			
			System.out.print("찾는 데이터가 맞습니까? 1. 예 2. 아니오 3. 종료 > ");
			choice = nextInt();
			
			if (choice == 3) {
				return;
			}
		} while (choice == 2);
		
		System.out.print("정말 삭제하시겠습니까? 1. 예 2. 아니오 > ");
		int choice2 = nextInt();
		if (choice2 == 1) {
			deleteData(idx);
			save();
		} else {	
			return;
		}
		System.out.println("삭제되었습니다.");
	}
	
	void sort() {
		List<Student> tmpStudents = students.subList(0, students.size());
		Collections.sort(tmpStudents, Student.RANK_ORDER);
		
		printTopBar();
		for(int i = 0; i < tmpStudents.size(); i++) {
			System.out.println(tmpStudents.get(i));
		}
	}
	
	private void save() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("stu.ser")));			
			oos.writeObject(students);
			oos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
