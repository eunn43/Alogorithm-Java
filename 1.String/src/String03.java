/*
 * 	3. ���� �� �ܾ�
 * 
 * 	�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷�
 * 
 */
import java.util.Scanner;

public class String03 {
	static String solution(String str) {
		String answer="";
		int max = Integer.MIN_VALUE;
		String arr[] = str.split(" ");
		
		for(String s : arr) {
			int len = s.length();
			if(len > max) {
				max = len;
				answer = s;
			}
		}
		return answer;
	}
	
	static String solution2(String str) {
		String answer="";
		int max = Integer.MIN_VALUE;
		int i;
		
		while((i = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, i);
			int len = tmp.length();
			if(len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(i + 1);
		}
		if(str.length() > max)
			answer = str;
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(solution(str));
		input.close();
	}

}
