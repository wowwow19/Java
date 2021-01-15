package chap05;

public class ArrayExample1 {
	public static void main(String[] args) {
		// [] : 배열(Array)
		// 단일 데이터 타입에 대해 연속적으로 데이터 저장
		// 크기가 고정, 변화 불가, 참조형 변수
		
		int[] scores;
//		String people[];	// 비추천
		String[] people = {"둘리", "도우너", "고길동"};		// 크기가 3으로 고정
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}
		
		people[1] = "마이콜";
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}
		
		
	}
}
