package chap10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx1 {
	public static void main(String[] args) {
//		System.out.println('\u00a4');
		
		double number = 1234567.89;
		String[] pattern = {
			"0",
			"#",
			"0.0",
			"#.#",
			"0000000000.0000",
			"##########.####",
			"#,###.#",
			"#.#%",
			"#.#\u2030",
			"#.#\u00a4"
		};
		
		for(String s : pattern) {
			DecimalFormat df = new DecimalFormat(s);
			System.out.printf("%19s : %s\n", s, df.format(number));
		}
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,###E0");
		
		Number num = null;
		try {
			num = df.parse("1,234,567.89");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		double d = num.doubleValue();
		System.out.println(d);
		System.out.println(df2.format(num));
	}
}
