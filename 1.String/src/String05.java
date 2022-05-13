/*
 * 	5. 특정 문자 뒤집기
 * 
 * 	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램
 * 
 */
import java.util.Scanner;

public class String05 {
	static String solution(String str) {
		String answer;
		char c[] = str.toCharArray();
		int lt = 0, rt=str.length()-1;
		while (lt < rt) {
			if(!Character.isAlphabetic(c[lt]))
				lt++;
			else if(!Character.isAlphabetic(c[rt]))
				rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}
}
