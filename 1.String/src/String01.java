/*	
 * 	1. 문자 찾기
 * 
 * 	한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 
 * 	입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램
 * 
 */
import java.util.Scanner;

public class String01 {
	static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c=Character.toUpperCase(c);
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char c = input.next().charAt(0);
		System.out.println(solution(str, c));
		input.close();
	}
}
