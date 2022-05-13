/*
 * 	7. ȸ�� ���ڿ�
 * 
 * 	ȸ�� ���ڿ� : �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ�
 * 	���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� YES, �ƴϸ� NO�� ����ϴ� ���α׷�
 * 	��ҹ��� ���� x
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
