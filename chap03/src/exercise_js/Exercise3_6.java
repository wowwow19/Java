package exercise_js;

public class Exercise3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5 / 9f * (fahrenheit - 32); // 37.77778
//		System.out.println(celcius2);
//		float celcius2 = ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5f); // 3778.2778 : 0.5로 더하면 오류??
//		System.out.println(celcius2);
//		float celcius3 = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5f); // 3778.0 : 나머지 소수점 버리기
//		System.out.println(celcius3);
		float celciusRound = (int)(celcius * 100 + 0.5f) / 100f;

		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celciusRound);
	}
}
