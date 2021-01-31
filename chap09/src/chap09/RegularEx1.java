package chap09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car",
							"combat", "count", "date", "disc"};
//		Pattern p = Pattern.compile("c[a-z]*");
		String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.",
							"c.*", "c\\.", "c\\w", "c\\d", "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};
		for (int j = 0; j < pattern.length; j++) {
			Pattern p = Pattern.compile(pattern[j]);
			System.out.print("Pattern : " + pattern[j] + " 결과: ");
			for (int i = 0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches()) {
					System.out.print(data[i] + ", ");
				}
			}
			System.out.println();
		}
	}
}
