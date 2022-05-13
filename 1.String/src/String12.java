/*
 *	12. 암호
 *
 *	암호 한 문자는 #또는 *으로 7개로 구성되어 있다. #은 1, *은 0인 2진수로 변환할 수 있다.
 *	2진수를 10진수로 변환하여 그에 해당하는 아스키코드 값이 해당 문자이다. 이를 해석하는 프로그램
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
