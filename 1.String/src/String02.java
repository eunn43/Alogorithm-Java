/*
 * 	2. ��ҹ��� ��ȯ
 * 
 * 	�빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷�
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
