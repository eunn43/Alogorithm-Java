/*
 * 	6. 중복문자 제거
 * 
 * 	소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램
 * 	중복에 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지
 * 
 */
import java.util.Scanner;

public class String06 {
	static String solution(String str) {
		String answer="";
		for(int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i)))
				answer += str.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
