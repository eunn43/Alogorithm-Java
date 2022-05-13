/*
 * 	9. ���ڸ� ����
 * 
 * 	���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����� ���α׷�
 * 
 */
import java.util.Scanner;

public class String09 {
	static int solution(String str) {
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				answer *= 10;
				answer += str.charAt(i) - '0';
			}
		}
		return answer;
	}
	
	static int solution2(String str) {
		String answer="";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c))
				answer += c;
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
