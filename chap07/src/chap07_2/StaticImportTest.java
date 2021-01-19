package chap07_2;

import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

import org.apache.commons.lang3.StringUtils;

public class StaticImportTest {
	public static void main(String[] args) {
		out.println(random());
		out.println(PI);
		out.println(parseInt("1234"));
		System.out.println(StringUtils.trim("   a bc "));					// 양쪽 공백 제거
		System.out.println(StringUtils.deleteWhitespace("a bc d      e"));	// 중간 공백 제거
		
		// jar import
		// 구글에 유틸리티명 maven 검색해서 최신버전으로 JAR 파일 다운로드
		// 프로젝트 우클릭 > Properties > Java Build Path > Libraries > Add external JARs
	}
}