/*
 * 	7. 회문 문자열
 * 
 * 	회문 문자열 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 	문자열이 입력되면 해당 문자열이 회문 문자열이면 YES, 아니면 NO를 출력하는 프로그램
 * 	대소문자 구분 x
 * 
 */
import java.util.Scanner;

public class String07 {
	static String solution(String str) {
		int len = str.length();
		str = str.toUpperCase();
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1))
				return "NO";
		}
		return "YES";
	}
	
	static String solution2(String str) {
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp))
			return "YES";
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
