/*	
 * 	1. ���� ã��
 * 
 * 	�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� 
 * 	�Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷�
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
