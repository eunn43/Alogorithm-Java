/*
 * 	11. 문자열 압축
 * 
 * 	알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
 * 	반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램
 * 	단, 반복횟수가 1인 경우 생략
 * 
 */
import java.util.Scanner;

public class String11 {
	static String solution(String str) {
		String answer="";
		str += " ";
		int cnt = 0;
		
		for(int i=0; i < str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				cnt++;
				answer += str.charAt(i);
				if(cnt != 1)
					answer += cnt;
				cnt = 0;
			}
			else {
				cnt++;
			}
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
