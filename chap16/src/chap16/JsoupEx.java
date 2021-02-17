package chap16;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupEx {
	public static void main(String[] args) throws IOException {
//		Connection conn = Jsoup.connect("https://naver.com");
		Connection conn = Jsoup.connect("http://www.human.or.kr/");
		Document doc = conn.get();
		Elements e = doc.select(".top_up_notice_box");
		System.out.println(e);
		List<Element> list = e.subList(0, e.size());
		System.out.println(list);
		for(Element ele : list) {
			System.out.println(ele.text());
		}
	}
}
