/*
 * 	11. ���ڿ� ����
 * 
 * 	���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ���
 * 	�ݺ��Ǵ� ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷�
 * 	��, �ݺ�Ƚ���� 1�� ��� ����
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
