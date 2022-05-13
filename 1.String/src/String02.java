/*
 * 	2. 대소문자 변환
 * 
 * 	대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램
 * 
 */
import java.util.Scanner;

public class String02 {
	static String solution(String str) {
		String answer="";
		for(char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z')
				answer += (char)(c - 32);
			else if (c >= 'A' && c <= 'Z')
				answer += (char)(c + 32);
		}
		return (answer);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
