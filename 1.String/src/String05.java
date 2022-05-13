/*
 * 	5. Ư�� ���� ������
 * 
 * 	���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
 * 	Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷�
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
