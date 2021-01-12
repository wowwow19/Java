package chap03;

public class NanInfinityExam {
	public static void main(String[] args) {
		System.out.println(5 / 0.0); // Infinity
		System.out.println(5 % 0.0); // NaN
		System.out.println(0.0 / 0.0); // NaN
		
		System.out.println(Double.isNaN(5 % 0.0)); // true
	}
}
