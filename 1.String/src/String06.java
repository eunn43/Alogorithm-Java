/*
 * 	6. �ߺ����� ����
 * 
 * 	�ҹ��ڷ� �� �� ���� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷�
 * 	�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ ����
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
