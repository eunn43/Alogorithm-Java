/*
 *	12. ��ȣ
 *
 *	��ȣ �� ���ڴ� #�Ǵ� *���� 7���� �����Ǿ� �ִ�. #�� 1, *�� 0�� 2������ ��ȯ�� �� �ִ�.
 *	2������ 10������ ��ȯ�Ͽ� �׿� �ش��ϴ� �ƽ�Ű�ڵ� ���� �ش� �����̴�. �̸� �ؼ��ϴ� ���α׷�
 *	
 */
import java.util.Scanner;

public class String12 {
	static String solution(int n, String str) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str = input.next();
		System.out.println(solution(n, str));
		input.close();
	}

}
